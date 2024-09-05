package com.interview.MethodChanining;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("ABHinab");
        s.setAge(25);
        s.setCity("Kanpur");
        System.out.println(s);

        Student c = Student.of()
                .setAge(25)
                .setName("Abhinav")
                .setCity("Kanpur");
        System.out.println(c);
    }
}
