package com.games.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.games.model.Order1;

@Repository("orderdao")
public class OrderDaoImp extends AbstractDao implements OrderDao{
 
    public void saveOrder(Order1 order) {
        persist(order);
    }
 
    @SuppressWarnings("unchecked")
    public List<Order1> findAllOrder() {
        Criteria criteria = getSession().createCriteria(Order1.class);
        return (List<Order1>) criteria.list();
    }
 
    public void deleteOrderById(int oid) {
        Query query = getSession().createSQLQuery("delete from Order where id = :id");
        query.setInteger("id", oid);
        query.executeUpdate();
    }
 
     
    public Order1 findOrderById(int oid){
        Criteria criteria = getSession().createCriteria(Order1.class);
        criteria.add(Restrictions.eq("id",oid));
        return (Order1) criteria.uniqueResult();
    }
     
    public void updateOrder(Order1 order){
        getSession().update(order);
    }

	




}

	     