package com.sl.orm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Insert {

	public static void main(String[] args) {
		
		
		Configuration cfg  = new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session= factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Student s = new Student();
		
		s.setId(1004);
		s.setFirstName("Sai");
		s.setLastName("Venkat");
		
		session.save(s);
		
		transaction.commit();
		factory.close();
		session.close();
		
		
		
		
		
		

	}

}
