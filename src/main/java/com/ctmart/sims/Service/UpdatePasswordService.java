package com.ctmart.ctbs.Service;

import java.util.List;
//import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctmart.ctbs.Entity.UpdatePasswordEntity;
import com.ctmart.ctbs.Repository.UpdatePasswordRepository;

@Service
public class UpdatePasswordService {

	/* this class contains all the business logic of your system
	 * Create a performer record
	 * Read performer record/s by performerID or performer_name
	 * Update a performer record
	 * Delete a performer record
	 */
	
	@Autowired(required = false)
	UpdatePasswordRepository uprepo;
	
	//C - Create or insert a performer record
	public UpdatePasswordEntity insertUpdatePassword(UpdatePasswordEntity updatepassword) {
		return uprepo.save(updatepassword);
	}
	
	//R - Read all records from tbl_updatepassword
	public List<UpdatePasswordEntity> getAllUpdatePassword(){
		return uprepo.findAll();
	}
	
//	//U - Update a performer record 
//	public UpdatePasswordEntity putUpdatePassword(String new_password, String confirm_password, UpdatePasswordEntity newUpdatePasswordDetails) throws Exception{
//		
//		UpdatePasswordEntity updatepassword = new UpdatePasswordEntity();
//		
//		try {
//			//Steps in updating
//			//Step 1 - search the id number of the performer
//			updatepassword = uprepo.findByID(performerID).get(); //findById() is a pre-defined method
//			
//			//Step 2 - update the record
//			updatepassword.setNew_password(newUpdatePasswordDetails.getNew_password());
//			updatepassword.setConfirm_password(newUpdatePasswordDetails.getConfirm_password());
//			
//			//Step 3 - save the information and return the value
//			return uprepo.save(performer);
//
//		} catch(NoSuchElementException nex) {
//			throw new Exception("ID Number " + performerID + "does not exist!");
//		}
//	}
}