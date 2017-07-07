package com.game.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.games.model.PRODUCT;





@Repository
public class ProductDaoImp implements ProductDao{

	
	public ProductDaoImp(){
		
		System.out.println("ProductDao object is created");
		
		
	}
	
	@Autowired
	
	private SessionFactory sessionFactory;
	
	public void saveProduct(PRODUCT product){
		
		Session session=sessionFactory.getCurrentSession();
		session.save(product);
	}
}
