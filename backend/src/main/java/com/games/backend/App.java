package com.games.backend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.game.dao.ProductDaoImp;
import com.games.configuration.DBConfiguration;
import com.games.model.PRODUCT;
import com.games.services.ProductServices;
import com.games.services.ProductServicesImp;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        
        ApplicationContext context=new AnnotationConfigApplicationContext(DBConfiguration.class,ProductDaoImp.class,ProductServicesImp.class);
        System.out.println( "Hello World!" ); 
		
        
        
        ProductServices productService=(ProductServices)context.getBean("productServicesImp");
        PRODUCT product=new PRODUCT();
        product.setProductName("pencil");
        product.setPrice(200);
        product.setQuantity(20);
        product.setDescription("sdwqd");
        
        productService.saveProduct(product);
    }
}