package com.interview.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    private static List<Integer> collect;

    public static void main(String[] args) {
        // create a list and filter all even numbers from list
        List<Integer> list1 = List.of(2, 4, 60, 11, 22, 67);
        // list1.add(45);

        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(34);
        list2.add(23);
        list2.add(78);

        List<Integer> list3 = Arrays.asList(12, 34, 23, 78);

        // list1
        // without stream
        List<Integer> listEven = new ArrayList<>();
        for (Integer i : list1) {
            if (i % 2 == 0) {
                listEven.add(i);
            }
        }
        System.out.println(list1);
        System.out.println(listEven);

        Stream<Integer> stream = list1.stream();
        List<Integer> collect = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()));
        System.out.println(list1.stream().filter(i -> i > 15).collect(Collectors.toList()));
    }
}
