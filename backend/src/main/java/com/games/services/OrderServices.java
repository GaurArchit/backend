package com.games.services;

import java.util.List;

import com.games.model.Order;
public interface OrderServices {

	void saveOrder(Order order);
	
	
	
	List<Order> findAllOrder();
	 
    void deleteOrderById(int oid);
 
    Order findOrderById(int oid);
 
    void updateOrder(Order order);
}
	

