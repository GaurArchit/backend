package com.games.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity

public class Kart{
	@Id @GeneratedValue
	private int kid;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	private User user;
	public void setUser(User user) {
		this.user = user;
	}
	public User getUser(){
		return user;
	}

public int getKid() {
	return kid;
}
public void setKid(int kid) {
	this.kid = kid;
}

}