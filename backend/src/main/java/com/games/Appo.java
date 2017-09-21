package com.games;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.games.configuration.AppConfig;
import com.games.model.Kart;
import com.games.model.Order;
import com.games.model.User;
import com.games.services.KartServices;
import com.games.services.OrderServices;
import com.games.services.UserServices;



public class Appo {


    public static void main( String[] args ) throws Exception
    {
    	
    	 AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    	 
    	 OrderServices orderService=(OrderServices)context.getBean("orderServicesImpl");
    	  



    	
    	
    	 System.out.println( "Hello World!" ); 
    	
    	 
    	 
    	 KartServices kartServices=(KartServices)context.getBean("kartServicesImpl");
  
    	     
    Kart	  kart= kartServices.findKartById(1);
    	 
    	 
    	 
    	
    Order order = new Order();
    order.setOrderdetails("Games FifaS");
    	 order.setOrderdetails("Games fifa");
    	 
    	 
    	 
    order.setKart(kart);
    order.setOid(1);
    	 
    	        
 
    		//this is the line where it shows error it changes my setUser into static
    		

    		SessionFactory  sessionFactory= new AnnotationConfiguration().configure().buildSessionFactory();
    		
    		Session session = sessionFactory.openSession();
    		session.beginTransaction();

session.persist(kart);
    		


    		session.getTransaction().commit();
    		session.close();

    		sessionFactory.close();
    		
    	context.close();
    		}
    	
    		
}
