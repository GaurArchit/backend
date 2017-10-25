package com.games.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity

public class Kart{
	@Id @GeneratedValue(strategy = GenerationType.AUTO )
	private int kid;
	private String userDetails;
	public String getUserDetails() {
		return userDetails;
	}


	
	
	
	

	public void setUserDetails(String userDetails) {
	
		this.userDetails = userDetails;
	}
	
	
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="uid")
	private User user;
	
	
	public User getUser()
	{
		return user;
		
	}
	
   

public void setUser(User user) {
		this.user = user;
	}



public int getKid() {
	return kid;
}
public void setKid(int kid) {
	this.kid = kid;
}

}