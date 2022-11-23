package com.ctmart.ctbs.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_updatepassword")
public class UpdatePasswordEntity {
	
	//define data members
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String user;
	
	private String new_password;
	private String confirm_password;
	
	//Constructor
	public UpdatePasswordEntity(String user, String new_password, String confirm_password) {
		super();
		this.user = user;
		this.new_password = new_password;
		this.confirm_password = confirm_password;
	}

	//Empty Constructor
	public UpdatePasswordEntity() {
	}
	
	
	//Getters and Setters
	public String getUser() {
		return user;
	}

//	public void setUser(String user) {
//		this.user = user;
//	}

	public String getNew_password() {
		return new_password;
	}

	public void setNew_password(String new_password) {
		this.new_password = new_password;
	}

	public String getConfirm_password() {
		return confirm_password;
	}

	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}
}