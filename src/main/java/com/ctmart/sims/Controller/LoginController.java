package com.ctmart.ctbs.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctmart.ctbs.Entity.LoginEntity;
import com.ctmart.ctbs.Service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	LoginService lserv;
	
	//Create or insert a login record
	@PostMapping("/postLogin")
	public LoginEntity insertLogin(@RequestBody LoginEntity login) {
		return lserv.insertLogin(login);
	}
	
	//Read all login records
	@GetMapping("/getAllLogin")
	public List<LoginEntity> getAllPerformer() {
		return lserv.getAllLogin();
	}
}