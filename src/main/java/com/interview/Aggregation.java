package com.interview;

import java.util.ArrayList;
import java.util.List;

class Department {
    String name;

    Department(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department [name=" + name + "]";
    }
}

class University {
    String name;
    List<Department> departments;

    University(String name, List<Department> departments) {
        this.name = name;
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "University [name=" + name + ", departments=" + departments + "]";
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Maths");

        List<Department> departments = new ArrayList<>();
        departments.add(d1);
        departments.add(d2);

        University university = new University("ABC University", departments);
        System.out.println(university.departments.get(0));
    }
}
