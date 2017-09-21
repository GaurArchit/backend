package com.games.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.games.model.Order;

@Repository("orderdao")
public class OrderDaoImp extends AbstractDao implements OrderDao{
 
    public void saveOrder(Order order) {
        persist(order);
    }
 
    @SuppressWarnings("unchecked")
    public List<Order> findAllOrder() {
        Criteria criteria = getSession().createCriteria(Order.class);
        return (List<Order>) criteria.list();
    }
 
    public void deleteOrderById(int oid) {
        Query query = getSession().createSQLQuery("delete from Order where id = :id");
        query.setInteger("id", oid);
        query.executeUpdate();
    }
 
     
    public Order findOrderById(int oid){
        Criteria criteria = getSession().createCriteria(Order.class);
        criteria.add(Restrictions.eq("id",oid));
        return (Order) criteria.uniqueResult();
    }
     
    public void updateOrder(Order order){
        getSession().update(order);
    }

	




}

	     