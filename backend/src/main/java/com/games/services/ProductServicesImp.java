package com.games.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.game.dao.ProductDao;
import com.games.model.PRODUCT;

@Service
@Transactional
public class ProductServicesImp implements ProductServices {

	public ProductServicesImp(){
		System.out.println("ProductServicesImp is created");
	
	}
	
	@Autowired
	private ProductDao productDao;
	
	public void saveProduct(PRODUCT product){
	productDao.saveProduct(product);
}
}
