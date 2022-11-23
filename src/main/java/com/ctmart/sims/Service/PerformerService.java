package com.ctmart.ctbs.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctmart.ctbs.Entity.PerformerEntity;
import com.ctmart.ctbs.Repository.PerformerRepository;

@Service
public class PerformerService {

	/* this class contains all the business logic of your system
	 * Create a performer record
	 * Read performer record/s by performerID or performer_name
	 * Update a performer record
	 * Delete a performer record
	 */
	
	@Autowired(required = false)
	PerformerRepository prepo;
	
	//C - Create or insert a performer record
	public PerformerEntity insertPerformer(PerformerEntity performer) {
		return prepo.save(performer);
	}
	
	//R - Read all records from tbl_performer
	public List<PerformerEntity> getAllPerformer(){
		return prepo.findAll();
	}
	
	//U - Update a performer record 
	public PerformerEntity putPerformer(int performerID, PerformerEntity newPerformerDetails) throws Exception{
		
		PerformerEntity performer = new PerformerEntity();
		
		try {
			//Steps in updating
			//Step 1 - search the id number of the performer
			performer = prepo.findById(performerID).get(); //findById() is a pre-defined method
			
			//Step 2 - update the record
			performer.setPerformer_name(newPerformerDetails.getPerformer_name());
			performer.setPerformer_type(newPerformerDetails.getPerformer_type());
			
			//Step 3 - save the information and return the value
			return prepo.save(performer);

		} catch(NoSuchElementException nex) {
			throw new Exception("ID Number " + performerID + "does not exist!");
		}
	}
	
	//D - Delete performer record
	public String deletePerformer(int performerID){
		String msg;
		if(prepo.findById(performerID) != null) {	//Step 1 - find the record
			prepo.deleteById(performerID);			//Step 2 - delete the record
			
			msg = "Performer ID Number " + performerID + " is successfully deleted!";
		}
		else
			msg = "Performer ID Number " + performerID + " is NOT found!";
		
		return msg;
	}
}