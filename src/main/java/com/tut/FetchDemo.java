package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
    public static void main(String[] args) {
        // get and load
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Student student = (Student) session.get(Student.class, 2);
        Student student_l = (Student) session.load(Student.class, 2);

        Address add = (Address) session.get(Address.class, 1);
        System.out.println(student);
        System.out.println(student_l);
        System.out.println(add.getCity() + "  " + add.getStreet());
        session.close();
        factory.close();
    }
}
