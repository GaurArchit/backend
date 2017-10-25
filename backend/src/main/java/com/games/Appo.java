package com.games;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.games.configuration.AppConfig;
import com.games.model.Kart;
import com.games.model.Order1;
import com.games.model.User;
import com.games.services.KartServices;
import com.games.services.OrderServices;
import com.games.services.UserServices;



public class Appo {


    public static void main( String[] args ) throws Exception
    {
    	
    	 AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    	 
    	



    	
    	
    	 System.out.println( "Hello World!" ); 
    	
    	 
    	 
    	 KartServices kartServices=(KartServices)context.getBean("kartServicesImpl");
  
    	 Kart kar =new Kart();
    	 kar.setUserDetails("Archit");
    	 
    	 
    	 OrderServices orderService=(OrderServices)context.getBean("orderServicesImpl");
   
    	Order1 ord = new Order1();
    	Order1 ord2= new Order1();
    	ord.setOrderdetails("Games");
           ord2.setOrderdetails("Fifa");
 ord.setKart(kar);
 
 ord2.setKart(kar);
 
orderService.saveOrder(ord);
orderService.saveOrder(ord2);

    		//this is the line where it shows error it changes my setUser into static
    		

    	

    }
}
    		

