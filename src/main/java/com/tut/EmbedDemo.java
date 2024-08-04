package com.tut;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmbedDemo {

    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Student st1 = new Student();
        st1.setCity("Kanpur");
        st1.setId(1);
        st1.setName("Abhinav");
        Certificate certi1 = new Certificate();
        certi1.setCourse("JAVA Spring Boot Hibernate");
        certi1.setDuration("5 days");
        st1.setCerti(certi1);

        Student st2 = new Student();
        st2.setCity("Kanpur");
        st2.setId(2);
        st2.setName("Sanku");
        Certificate certi2 = new Certificate();
        certi2.setCourse("JAVA Spring Boot Hibernate");
        certi2.setDuration("6 days");
        st2.setCerti(certi2);

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(st1);
        session.save(st2);
        tx.commit();
        session.close();

        factory.close();
    }
}
