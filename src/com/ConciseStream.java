package com;

import java.util.Arrays;
import java.util.List;

/*
    source reference: https://www.youtube.com/watch?v=bcrl-GL0vV4
 */
public class ConciseStream {
    public static void main(String[] args) {

        List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "Amanda", "Hans", "Shivika", "Sarah");

        // This Stream is function equivlent to the streams below it
        people.stream()
            .map((String element) -> {
                return element.toLowerCase();
            })
            .forEach((String element) -> {
                System.out.println(element);;
            });

        // this stream is the equivolent to the stream above and those below
        people.stream()
            .map((String element) ->  element.toLowerCase())
            .forEach((String element) -> System.out.println(element));

        // here the Type String is inferred
        people.stream()
            .map(element ->  element.toLowerCase())
            .forEach(element -> System.out.println(element));

        // here we notice an opportunity for method references
        people.stream()
            .map(String::toLowerCase)
            .forEach(System.out::println);
    }

}
