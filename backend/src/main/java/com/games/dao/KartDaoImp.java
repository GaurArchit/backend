package com.games.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.games.model.Kart;
 

 
@Repository("kartDao")
public class KartDaoImp extends AbstractDao implements KartDao{
 
    public void saveKart(Kart kart) {
        persist(kart);
    }
 
    @SuppressWarnings("unchecked")
    public List<Kart> findAllProduct() {
        Criteria criteria = getSession().createCriteria(Kart.class);
        return (List<Kart>) criteria.list();
    }
 
    public void deleteKartById(int kid) {
        Query query = getSession().createSQLQuery("delete from Kart where id = :id");
        query.setInteger("id", kid);
        query.executeUpdate();
    }
 
     
    public Kart findKartById(int kid){
        Criteria criteria = getSession().createCriteria(Kart.class);
        criteria.add(Restrictions.eq("id",kid));
        return (Kart) criteria.uniqueResult();
    }
     
    public void updateKart(Kart kart){
        getSession().update(kart);
    }

	public List<Kart> findAllKart() {
		// TODO Auto-generated method stub
		return null;
	}

}

	     