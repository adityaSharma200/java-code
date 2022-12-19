package com.mavensample1.hibernatedemo;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Updatequery{
	public static void main(String[] args)
	{
	       Car c =new Car();
	    Configuration cfg =new Configuration().configure().addAnnotatedClass(Car.class);
	    SessionFactory sf =cfg.buildSessionFactory();
	    Session ses = sf.openSession();
	    Transaction tx =ses.beginTransaction();
	    Query qu =ses.createQuery("update Car set carprice=:cp where carmodel=:cm");
	    qu.setParameter("cp",500000);
	    qu.setParameter("cm",4785);
	    int result =qu.executeUpdate();
	    System.out.println(result+"row updated ");
	      tx.commit();
	      ses.close();
	    
	     
	}

}
