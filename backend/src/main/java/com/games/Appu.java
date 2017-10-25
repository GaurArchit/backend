package com.games;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.games.configuration.AppConfig;
import com.games.dao.UserDaoImp;

import com.games.model.User;
import com.games.services.ProductServices;
import com.games.services.UserServices;
import com.games.services.UserServicesImpl;


public class Appu {

	   public static void main( String[] args ) throws Exception
	    {
	
	
	
	
	 AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	 

    UserServices userService=(UserServices)context.getBean("userServicesImpl");
   User   user =new User();
  
   user.setAddress("skldjoifqwrufqelfnqeougt");
   user.setUsername("admin");
   user.setRole("role_admin");
   user.setMobile(9999988);
   user.setPassword("123");
   userService.saveUser(user);
   context.close();
}
}