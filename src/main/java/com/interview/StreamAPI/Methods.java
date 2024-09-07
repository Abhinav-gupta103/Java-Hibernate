package com.interview.StreamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {
        // filter(Predicate)
        // Boolean value function
        // e -> {return true or false} or e-> e> 10

        // map(Function)
        /* each element operation */

        List<String> names = List.of("Aman", "Ankit", "Abhinav", "Durgesh");
        List<String> newNames = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newNames);

        List<Integer> numbers = List.of(23, 4, 2, 5, 7, 4);
        List<Integer> squares = numbers.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(squares);

        names.stream().forEach(e -> {
            System.out.println(e);
        });

        newNames.stream().forEach(System.out::println);

        numbers.stream().sorted().forEach((System.out::println));

        Integer integer = numbers.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println(integer);
        integer = numbers.stream().max((x, y) -> x.compareTo(y)).get();

        System.out.println(integer);
    }
}
