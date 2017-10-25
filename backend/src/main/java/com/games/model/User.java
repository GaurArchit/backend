package com.games.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.games.model.Order1;
@Entity

public class User{
	@Id @GeneratedValue(strategy = GenerationType.AUTO )
private int uid;
private String password;
private String role="role_user";
private int active=1 ;
private String username;
private double mobile;
private String address;
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public void setUsername(String username) {
	this.username = username;
}
public int getActive() {
	return active;
}
public void setActive(int active) {
	this.active = active;
}

public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}

public double getMobile() {
	return mobile;
}
public void setMobile(double mobile) {
	this.mobile = mobile;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}


