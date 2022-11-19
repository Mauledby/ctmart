package com.ctmart.sims.Controller;

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

import com.ctmart.sims.Entity.TicketEntity;
import com.ctmart.sims.Service.TicketService;



@RestController
@RequestMapping("/ticket")
public class TicketController {

		@Autowired
		TicketService tserv;
	
		//printHello
		@GetMapping("/print")
		public String printHelloTicket() {
			return "Hello Ticket!";
		}
		
		//C - Create or insert a ticket record
		@PostMapping("/postTicket")
		public TicketEntity insertTickets(@RequestBody TicketEntity ticket) {
			return tserv.insertTickets(ticket);
		}
		
		//R - Read all records
		@GetMapping("/getAllTickets")
		public List<TicketEntity> getAllTicket(){
			return tserv.getAllTicket();
		}
		
		//R - Read records by Concert
		@GetMapping("/getByConcert")
		public TicketEntity findByConcert(@RequestParam String concert) {
			return tserv.findByConcert(concert);
		}
		
		//Update a record
		@PutMapping("/putTicket")
		public TicketEntity putTicket(@RequestParam int idticket, @RequestBody TicketEntity newTicketDetails) throws Exception{
			return tserv.putTicket(idticket, newTicketDetails);
		}
		
		//Delete a record
		@DeleteMapping("/deleteTicket/{idticket}")
		public String deletesTicket(@PathVariable int idticket) {
			return tserv.deleteTicket(idticket);
		}
}
