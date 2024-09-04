package com.sort;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {
    public static void main(String[] args) {
        ArrayList<Emp> emps = new ArrayList<>();
        emps.add(new Emp("Abhinav", "7880524111", 19));
        emps.add(new Emp("Rishu", "7875461231", 12));
        emps.add(new Emp("Kaif", "756465412877", 35));
        System.out.println(emps);
        // Collections.sort(emps); // Comparable
        Collections.sort(emps, new IdComparator()); // Comparator
        System.out.println(emps);

        ArrayList<Emp> emps1 = new ArrayList<>(emps);
        Collections.sort(emps1, new NameComparator());
        System.out.println(emps1);
    }

}
