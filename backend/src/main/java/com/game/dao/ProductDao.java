package com.game.dao;

import com.games.model.Product;

import java.util.List;

 
public interface ProductDao {
 
    void saveProduct(Product product);
     
    List<Product> findAllProduct();
     
    void deleteProductById(int id );
     
    Product findProductById(int id);
     
    void updateProduct(Product product);
}