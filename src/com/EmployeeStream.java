package com;

import java.util.ArrayList;

class Employee {
    public String salary;
    public Employee(String salary){
        this.salary = salary;
    }
}

public class EmployeeStream {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("50000"));
        list.add(new Employee("75000"));
        list.add(new Employee("100000"));

        int sum =
            list.stream() // create the stream
            .map(employee -> employee.salary) // after this line we have a stream of "salary" Strings
            .map(Integer::parseInt) // after this line we have a stream of ints
            .reduce(0, (tempSum, value) -> tempSum + value); // terminal operation to sum the ints

        System.out.println("salary sum = $" + sum);
    }
}

