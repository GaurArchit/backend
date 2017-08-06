package com.games.backend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.game.dao.ProductDaoImp;
import com.games.configuration.DBConfiguration;
import com.games.model.Product;
import com.games.services.ProductServices;
import com.games.services.ProductServicesImpl;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        
        ApplicationContext context=new AnnotationConfigApplicationContext(DBConfiguration.class,ProductDaoImp.class,ProductServicesImpl.class);
        System.out.println( "Hello World!" ); 
		
        
        
        ProductServices productService=(ProductServices)context.getBean("productServicesImpl");
        Product product=new Product();
       
        product.setProductName("pencsddl");
        
        product.setPrice(2000);
        product.setQuantity(202);
        product.setDescription("iidqwdi");
        
        productService.saveProduct(product);
        
        
        
        product=new Product();
  
        
        product.setProductName("pen");
        
        product.setPrice(20);
        product.setQuantity(2000);
        product.setDescription("hb");
        
        productService.saveProduct(product);
        
        
        Product product1 = productService.findProductById(2);
       product1.setQuantity(900);
       productService.updateProduct(product1);
        
    }
}