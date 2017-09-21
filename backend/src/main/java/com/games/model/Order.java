package com.games.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



import org.hibernate.annotations.Cascade;

@Entity

public class Order implements Serializable  {
	 
 
	
	
	
	
	private String orderdetails ;
	public String getOrderdetails() {
			return orderdetails;
		}

		public void setOrderdetails(String orderdetails) {
			this.orderdetails = orderdetails;
		}

		@Id @GeneratedValue(strategy = GenerationType.AUTO )
	private int oid;

		public int getOid() {
			return oid;
		}

		public void setOid(int oid) {
			this.oid = oid;
		}
		

	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="kid")
	
	private Kart kart;
	
	
	
	


	
	public Kart getKart() {
		return kart;
	}

	public void setKart(Kart kart) {
		this.kart = kart;
	}


	}