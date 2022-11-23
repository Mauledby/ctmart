package com.ctmart.ctbs.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "tbl_venue")
public class VenueEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int venueID;

	private String venue_name;
	private String capacity;

	public VenueEntity() {}

	public VenueEntity(int venueID, String venue_name, String capacity) {
		super();
		this.venueID = venueID;
		this.venue_name = venue_name;
		this.capacity = capacity;
	}

	public int getVenueID() {
		return venueID;
	}

//	public void setVenueID(int venueID) {
//		this.venueID = venueID;
//	}

	public String getVenue_name() {
		return venue_name;
	}

	public void setVenue_name(String venue_name) {
		this.venue_name = venue_name;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
}