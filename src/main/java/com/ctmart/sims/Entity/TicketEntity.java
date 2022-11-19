package com.ctmart.sims.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ticket")
public class TicketEntity {

	//Kirk Montejo
	
	//define data members
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idticket;
	
	private int quantity;
	private String concert;
	private String ticketType;
    private double price;

    
    //empty constructor
    public TicketEntity() {
    }

    //constructor
    public TicketEntity(int idticket, int quantity, String concert, String ticketType, double price) {
        this.idticket = idticket;
        this.quantity = quantity;
        this.concert = concert;
        this.ticketType = ticketType;
        this.price = price;
    }

    //getters  and setters
    public int getIdticket() {
        return this.idticket;
    }

    public void setIdticket(int idticket) {
        this.idticket = idticket;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getConcert() {
        return this.concert;
    }

    public void setConcert(String concert) {
        this.concert = concert;
    }

    public String getTicketType() {
        return this.ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    


}
	
	
	
