package com.games.dao;


import com.games.model.User;

import java.util.List;

 
public interface UserDao {
 
    void saveUser(User user);
     
    List<User> findAllUser();
     
    void deleteUserById(int uid );
     
    User findUserById(int uid);
     
    User updateUser(User user);
}