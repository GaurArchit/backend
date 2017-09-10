package com.games.services;

import java.util.List;

import com.games.model.User;
public interface UserServices {

	void saveUser(User user);
	
	
	
	List<User> findAllUser();
	 
    void deleteUserById(int uid);
 
    User findUserById(int uid);
 
    void updateUser(User user);
}