package com.games.dao;

import com.games.model.Order;

import java.util.List;

 
public interface OrderDao {
 
    void saveOrder(Order order);
     
    List<Order> findAllOrder();
     
    void deleteOrderById(int id );
     
    Order findOrderById(int id);
     
    void updateOrder(Order order);
}
