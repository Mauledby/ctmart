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

import com.ctmart.ctbs.Entity.VenueEntity;
import com.ctmart.ctbs.Service.VenueService;

@RestController
@RequestMapping("/venue")
public class VenueController {

	@Autowired
	VenueService vnserv;

	//Create or insert a student record
	@PostMapping("/postVenue")
	public VenueEntity insertVenue(@RequestBody VenueEntity venue) {
		return vnserv.insertVenue(venue);
	}

	//Read all Venue
	@GetMapping("/getAllVenue")
	public List<VenueEntity> getAllVenue(){
		return vnserv.getAllVenue();
	}

	//U - Update a Venue
		@PutMapping("/putVenue")
		public VenueEntity putVenue(@RequestParam int venueID, @RequestBody VenueEntity newVenueDetails) throws Exception {
			return vnserv.putVenue(venueID, newVenueDetails);
			}

	//D - Delete a Venue
		@DeleteMapping("/deleteVenue/{venueID}")
		public String deleteVenue(@PathVariable int venueID) {
			return vnserv.deleteVenue(venueID);
			}
}
