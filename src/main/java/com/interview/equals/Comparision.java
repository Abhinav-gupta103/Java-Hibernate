package com.interview.equals;

public class Comparision {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        System.out.println(st2 == st1);
        st2.x = 5464;
        System.out.println(st1.equals(st2));
    }
}
