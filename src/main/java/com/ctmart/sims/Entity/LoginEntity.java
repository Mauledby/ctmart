package com.ctmart.ctbs.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_login")
public class LoginEntity {
	
	//define data members
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private String user;
	private String password;
	
	
	//Constructor
	public LoginEntity(String user, String password) {
		super();
		this.user = user;
		this.password = password;
	}

	//Empty Constructor
	public LoginEntity() {
	}
	
	//Getters and Setters
	public String getUser() {
		return user;
	}

//	public void setUser(String user) {
//		this.user = user;
//	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}