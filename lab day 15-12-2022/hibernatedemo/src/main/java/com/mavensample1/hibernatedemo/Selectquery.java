package com.mavensample1.hibernatedemo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Selectquery {

	public static void main(String[] args) {
		 Configuration cfg =new Configuration().configure().addAnnotatedClass(Car.class);
		    SessionFactory sf =cfg.buildSessionFactory();
		    Session ses = sf.openSession();
		   ses.beginTransaction();
		   Query qu = ses.createQuery("from Car");
		   qu.setFirstResult(0);
		   qu.setMaxResults(5);
		   List list = qu.list();
		   System.out.println(list);
		  
		      ses.close();
	}

}
