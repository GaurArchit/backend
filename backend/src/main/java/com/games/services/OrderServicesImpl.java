package com.games.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.games.dao.OrderDao;
import com.games.model.Order1;
 

 
@Service("orderServicesImpl")
@Transactional
public class OrderServicesImpl implements OrderServices{
 
    @Autowired
    private OrderDao odao; 
     
    public void saveorder(Order1 order) {
        odao.saveOrder(order);
    }
 
    public List<Order1> findAllOrder() {
        return odao.findAllOrder();
    }
 
    public void deleteOrderById(int oid) {
        odao.deleteOrderById(oid);
    }
 
    public Order1 findOrderById(int oid) {
        return odao.findOrderById(oid);
    }
 
    public void updateOrder(Order1 order){
        odao.updateOrder(order);
    }

	public void saveOrder(Order1 order) {
		// TODO Auto-generated method stub
		odao.saveOrder(order);
	}

	
}
