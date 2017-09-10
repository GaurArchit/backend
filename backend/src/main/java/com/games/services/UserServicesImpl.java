package com.games.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.games.dao.UserDao;
import com.games.model.User;
 

 
@Service("userServicesImpl")
@Transactional
public class UserServicesImpl implements UserServices{
 
    @Autowired
    private UserDao userdao; 
     
    public void saveUser(User user) {
        userdao.saveUser(user);
    }
 
    public List<User> findAllUser() {
        return userdao.findAllUser();
    }
 
    public void deleteUserById(int uid) {
        userdao.deleteUserById(uid);
    }
 
    public User findUserById(int uid) {
        return userdao.findUserById(uid);
    }
 
    public void updateUser(User user){
        userdao.updateUser(user);
    }

}	

	
