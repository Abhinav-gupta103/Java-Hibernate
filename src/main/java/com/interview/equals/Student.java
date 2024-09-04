package com.interview.equals;

public class Student {
    int x = 34;

    @Override
    public boolean equals(Object obj) {
        System.out.println("Comparing");
        Student st = (Student) obj;
        return st.x == this.x;
    }
}
