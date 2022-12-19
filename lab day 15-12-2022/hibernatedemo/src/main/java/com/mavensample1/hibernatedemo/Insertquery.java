package com.mavensample1.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Insertquery {

	public static void main(String[] args) {
		
	 	
	 		Car c1=new Car();
	   	c1.setCarmodel(874569);
	    	c1.setCarname("Honda city");
	    	c1.setCarprice(9874561);
	    	Car c2=new Car();
	    	c2.setCarmodel(457896);
	    	c2.setCarname("Lamborghini");
	    	c2.setCarprice(456877456);
	    	
	      Configuration cf = new Configuration().configure().addAnnotatedClass(Car.class);
	      SessionFactory sf = cf.buildSessionFactory();
	      Session ses = sf.openSession();
	      ses.beginTransaction();
	      ses.save(c1);
	      ses.save(c2);
	     	ses.getTransaction().commit();
	    	ses.close();
	 	 


	}

}
