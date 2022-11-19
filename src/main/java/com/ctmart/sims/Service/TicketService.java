package com.ctmart.sims.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctmart.sims.Entity.TicketEntity;
import com.ctmart.sims.Repository.TicketRepository;

@Service
public class TicketService {
	/* this class contains all the business logic of your system
	 * Create a ticket Record
	 * Read ticket record/s by idticket or concert
	 * Update a ticket record
	 * Delete a ticket
	 */
	
	@Autowired
	TicketRepository trepo;
	
	
	//C - Create or insert a ticket record
	public TicketEntity insertTickets(TicketEntity ticket) {
		return trepo.save(ticket);
	}
	
	
	//R- Read all reocords from tbl_ticket
	public List<TicketEntity> getAllTicket(){
		return trepo.findAll();
	}
	
	//R- Read or search record by concert
	public TicketEntity findByConcert(String concert) {
			if(trepo.findByConcert(concert)!=null)
				return trepo.findByConcert(concert);
			else
				return null;
	}
	//U - Update a ticket record
	
	public TicketEntity putTicket(int idticket, TicketEntity newTicketDetails) throws Exception{
		TicketEntity ticket = new TicketEntity();
		
		try {
			//steps in updating
			//Step 1 - search the idticket number of the ticket
			ticket = trepo.findById(idticket).get(); //findById() is a pre-defiened method
			
			//Step 2 - update the record 
			ticket.setQuantity(newTicketDetails.getQuantity());
			ticket.setConcert(newTicketDetails.getConcert());
			ticket.setTicketType(newTicketDetails.getTicketType());
			ticket.setPrice(newTicketDetails.getPrice());
			
			//Step 3 - save the information and return the value
			return trepo.save(ticket);
			
			}catch(NoSuchElementException nex) {
				throw new Exception("Ticket "+ idticket + " does not exist");
			}
	}
	
	//D - Delete Ticket record
	public String deleteTicket(int idticket) {
		String msg;
		if(trepo.findById(idticket)!=null) {
			trepo.deleteById(idticket);
			msg = "Ticket ID Number "+idticket+" is successfully deleted!";
		}
		else
			msg = "Ticket ID Number" + idticket + " is NOT found!";
		
		return msg;
	}
	
}


