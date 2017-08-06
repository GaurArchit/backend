package com.games.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.game.dao.ProductDao;
import com.games.model.Product;
 

 
@Service("productServicesImpl")
@Transactional
public class ProductServicesImpl implements ProductServices{
 
    @Autowired
    private ProductDao dao;
     
    public void saveProduct(Product product) {
        dao.saveProduct(product);
    }
 
    public List<Product> findAllProduct() {
        return dao.findAllProduct();
    }
 
    public void deleteProductById(int id) {
        dao.deleteProductById(id);
    }
 
    public Product findProductById(int id) {
        return dao.findProductById(id);
    }
 
    public void updateProduct(Product product){
        dao.updateProduct(product);
    }

	

	
	
}