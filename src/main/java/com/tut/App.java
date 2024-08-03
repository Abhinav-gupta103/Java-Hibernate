package com.tut;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Student st = new Student(2, "Sanku", "Kanpur");
		System.out.println(st);

		Address add = new Address();
		add.setStreet("Vikas Nagar");
		add.setCity("Kanpur");
		add.setOpen(true);
		add.setX(100.222);
		add.setAddedData(new Date());

		FileInputStream fis = new FileInputStream("src/main/java/com/tut/IMG_20230304_192426359~2 (1).jpg");
		byte[] data = new byte[fis.available()];
		fis.read(data);
		add.setImage(data);
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(st);
		session.save(add);
		tx.commit();
		session.close();
		System.out.println("Done .......");
	}

}
