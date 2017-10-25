package com.games.services;

import java.util.List;

import com.games.model.Order1;
public interface OrderServices {

	void saveOrder(Order1 order);
	
	
	
	List<Order1> findAllOrder();
	 
    void deleteOrderById(int oid);
 
    Order1 findOrderById(int oid);
 
    void updateOrder(Order1 order);
}
	

