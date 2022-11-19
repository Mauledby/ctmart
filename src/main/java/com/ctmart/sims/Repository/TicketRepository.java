package com.ctmart.sims.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ctmart.sims.Entity.TicketEntity;

@Repository
public interface TicketRepository extends JpaRepository<TicketEntity, Integer>{

	//user-defined query
	TicketEntity findByConcert(String concert);
}
