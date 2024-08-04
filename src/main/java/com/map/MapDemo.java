package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Question q1 = new Question();
        q1.setQuestionId(1);
        q1.setQuestion("what is java");
        Answer ans1 = new Answer(1, "Java is HLL", q1);
        q1.setAnswer(ans1);

        Question q2 = new Question();
        q2.setQuestionId(2);
        q2.setQuestion("what is reactJS");
        Answer ans2 = new Answer(2, "reactJS is framework", q2);
        q2.setAnswer(ans2);

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(q1);
        session.save(q2);
        session.save(ans1);
        session.save(ans2);
        tx.commit();
        session.close();
        factory.close();
    }
}
