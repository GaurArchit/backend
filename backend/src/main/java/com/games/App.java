package com.games;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.games.dao.ProductDaoImp;
import com.games.model.Product;
import com.games.services.ProductServices;
import com.games.configuration.AppConfig;


import java.math.BigDecimal;
import java.util.List;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class App 
{
    public static void main( String[] args ) throws Exception
    {
        
    	 AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	 
        System.out.println( "Hello World!" ); 
		
        
        
        ProductServices productService=(ProductServices)context.getBean("productServicesImpl");
        Product product=new Product();
       
        product.setProductname("pencsddl");
        
        product.setPrice(2000);
        product.setQuantity(202);
        product.setDescription("iidqwdi");
        
        productService.saveProduct(product);
        
        
  
        context.close();
    }
}