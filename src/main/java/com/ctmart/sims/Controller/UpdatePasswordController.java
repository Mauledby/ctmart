package com.ctmart.ctbs.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ctmart.ctbs.Entity.UpdatePasswordEntity;
import com.ctmart.ctbs.Service.UpdatePasswordService;

@RestController
@RequestMapping("/updatepassword")
public class UpdatePasswordController {

	@Autowired
	UpdatePasswordService upserv;
	
	//Create or insert a performer record
	@PostMapping("/postPerformer")
	public UpdatePasswordEntity insertUpdatePassword(@RequestBody UpdatePasswordEntity updatepassword) {
		return upserv.insertUpdatePassword(updatepassword);
	}
	
	//Read all performer records
	@GetMapping("/getAllUpdatePassword")
	public List<UpdatePasswordEntity> getAllUpdatePassword() {
		return upserv.getAllUpdatePassword();
	}
	
//	//U - Update a performer record
//	@PutMapping("/putUpdatePassword")
//	public UpdatePasswordEntity putUpdatePassword(@RequestParam String new_password, String confirm_password, @RequestBody UpdatePasswordEntity newPasswordDetails) throws Exception {
//		return upserv.putUpdatePassword(new_password, confirm_password, newPasswordDetails);
//		}
//		

}