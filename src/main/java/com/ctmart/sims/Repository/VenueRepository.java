package com.ctmart.ctbs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ctmart.ctbs.Entity.VenueEntity;


@Repository
public interface VenueRepository extends JpaRepository<VenueEntity, Integer>{
	
		//user-defined query
		VenueEntity findByvenueID(int venueID);
	
}
