package com.games.services;


import java.util.List;

import com.games.model.Product;
public interface ProductServices {

	void saveProduct(Product product);
	
	
	
	List<Product> findAllProduct();
	 
    void deleteProductById(int id);
 
    Product findProductById(int id);
 
    void updateProduct(Product product);
}
	

