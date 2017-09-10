package com.games.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.games.model.User;

 
@Repository("userDao")
public class UserDaoImp extends AbstractDao implements UserDao {
 
    @Autowired
    private SessionFactory sessionFactory;


    
    
    
    
    public void addUser(User user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
 
    }
 
    @SuppressWarnings("unchecked")
    public List<User> findAllUser() {
 
        return sessionFactory.getCurrentSession().createQuery("from User")
                .list();
    }
 
    public void deleteUserById(int uid) {
        User user = (User) sessionFactory.getCurrentSession().load(
                User.class, uid);
        if (null != user) {
            this.sessionFactory.getCurrentSession().delete(user);
        }
 
    }
 
    public User getUser(int uid) {
        return (User) sessionFactory.getCurrentSession().get(
                User.class, uid);
    }
 
    
    public User updateUser(User user) {
        sessionFactory.getCurrentSession().update(user);
        return user;
    }

    public void saveUser(User user) {
        persist(user);
    }
	public User findUserById(int uid) {
		// TODO Auto-generated method stub
		return null;
	}
 
}