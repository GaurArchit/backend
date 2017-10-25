package com.games.dao;

import com.games.model.Order1;

import java.util.List;

 
public interface OrderDao {
 
    void saveOrder(Order1 order);
     
    List<Order1> findAllOrder();
     
    void deleteOrderById(int id );
     
    Order1 findOrderById(int id);
     
    void updateOrder(Order1 order);
}
