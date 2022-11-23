package com.ctmart.ctbs.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ctmart.ctbs.Entity.PerformerEntity;
import com.ctmart.ctbs.Service.PerformerService;

@RestController
@RequestMapping("/performer")
public class PerformerController {

	@Autowired
	PerformerService pfrserv;
	
	
	//printHelloAdmin
	@GetMapping("/print")
	public String printHelloAdmin() {
		return "Hello, Admin!";
	}
	
	//Create or insert a performer record
	@PostMapping("/postPerformer")
	public PerformerEntity insertPerformer(@RequestBody PerformerEntity performer) {
		return pfrserv.insertPerformer(performer);
	}
	
	//Read all performer records
	@GetMapping("/getAllPerformer")
	public List<PerformerEntity> getAllPerformer() {
		return pfrserv.getAllPerformer();
	}
	
	//U - Update a performer record
	@PutMapping("/putPerformer")
	public PerformerEntity putPerformer(@RequestParam int performerID, @RequestBody PerformerEntity newPerformerDetails) throws Exception {
		return pfrserv.putPerformer(performerID,  newPerformerDetails);
		}
		
	//D - Delete a performer record
	@DeleteMapping("/deletePerformer/{performerID}")
	public String deletePerformer(@PathVariable int performerID) {
		return pfrserv.deletePerformer(performerID);
		}
}