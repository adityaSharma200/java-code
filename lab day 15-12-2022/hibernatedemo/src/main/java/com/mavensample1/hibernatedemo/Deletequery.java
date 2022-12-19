package com.mavensample1.hibernatedemo;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Deletequery {
	public static void main(String[] args)
	{
		 Configuration cfg =new Configuration().configure().addAnnotatedClass(Car.class);
		    SessionFactory sf =cfg.buildSessionFactory();
		    Session ses = sf.openSession();
		    Transaction tx =ses.beginTransaction();
		    Query qu =ses.createQuery("delete from Car where carmodel=7455");
		   
		   
		    int result =qu.executeUpdate();
		    System.out.println(result+"row deleted ");
		      tx.commit();
		      ses.close();
	}

}
