package com.jwt.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SimpleTest {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Student student = new Student();
		//student.setId(1L);
		student.setName("Kasturi Bhalerao");
		student.setRoll("105");
		student.setPhone("8888");
		student.setDegree("MCA");

		Transaction tx = session.beginTransaction();
		session.save(student);
		System.out.println("Object saved successfully.....!!");
		tx.commit();
		session.close();
		factory.close();
	}
}