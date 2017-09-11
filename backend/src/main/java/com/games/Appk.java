package com.games;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.games.configuration.AppConfig;
import com.games.model.Kart;
import com.games.model.User;
import com.games.services.KartServices;


public class Appk {

	public static void main (String[] args)
	{


	User user = new User();
	user.setMobile(9987);
	

	 AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

	 System.out.println( "Hello World!" ); 
			
	        
	        
	 KartServices kartService=(KartServices)context.getBean("kartServicesImpl");
	  Kart kart=new Kart();

	
	
	
	


	kart.setKid(2);

	//this is the line where it shows error it changes my setUser into static
	kart.setUser(user);


	SessionFactory  sessionFactory= new AnnotationConfiguration().configure().buildSessionFactory();
	
	Session session = sessionFactory.openSession();
	session.beginTransaction();


	session.save(kart);


	session.getTransaction().commit();
	session.close();

	sessionFactory.close();
	
context.close();
	}
}
	