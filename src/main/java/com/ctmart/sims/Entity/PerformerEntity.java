package com.ctmart.ctbs.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_performer")
public class PerformerEntity {
	
	//define data members
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int performerID;
	
	private String performer_name;
	private String performer_type;
	
	
	//Constructor
	public PerformerEntity(int performerID, String performer_name, String performer_type) {
		//super();
		this.performerID = performerID;
		this.performer_name = performer_name;
		this.performer_type = performer_type;
	}

	//Empty Constructor
	public PerformerEntity() {
	}
	
	//Getters and Setters
	public int getPerformerID() {
		return performerID;
	}


//	public void setPerformerID(int performerID) {
//		this.performerID = performerID;
//	}


	public String getPerformer_name() {
		return performer_name;
	}


	public void setPerformer_name(String performerName) {
		this.performer_name = performerName;
	}


	public String getPerformer_type() {
		return performer_type;
	}


	public void setPerformer_type(String performerType) {
		this.performer_type = performerType;
	}
	
}