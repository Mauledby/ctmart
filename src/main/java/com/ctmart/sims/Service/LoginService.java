package com.ctmart.ctbs.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctmart.ctbs.Entity.LoginEntity;
import com.ctmart.ctbs.Repository.LoginRepository;

@Service
public class LoginService {

	/* this class contains all the business logic of your system
	 * Create a performer record
	 * Read performer record/s by performerID or performer_name
	 * Update a performer record
	 * Delete a performer record
	 */
	
	@Autowired(required = false)
	LoginRepository lrepo;
	
	//C - Create or insert a performer record
	public LoginEntity insertLogin(LoginEntity login) {
		return lrepo.save(login);
	}
	
	//R - Read all records from tbl_login
	public List<LoginEntity> getAllLogin(){
		return lrepo.findAll();
	}
}