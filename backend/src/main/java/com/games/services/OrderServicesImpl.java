package com.games.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.games.dao.OrderDao;
import com.games.model.Order;
 

 
@Service("orderServicesImpl")
@Transactional
public class OrderServicesImpl implements OrderServices{
 
    @Autowired
    private OrderDao odao; 
     
    public void saveorder(Order order) {
        odao.saveOrder(order);
    }
 
    public List<Order> findAllOrder() {
        return odao.findAllOrder();
    }
 
    public void deleteOrderById(int oid) {
        odao.deleteOrderById(oid);
    }
 
    public Order findOrderById(int oid) {
        return odao.findOrderById(oid);
    }
 
    public void updateOrder(Order order){
        odao.updateOrder(order);
    }

	public void saveOrder(Order order) {
		// TODO Auto-generated method stub
		odao.saveOrder(order);
	}

}
