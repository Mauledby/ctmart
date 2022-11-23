package com.ctmart.ctbs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ctmart.ctbs.Entity.LoginEntity;

@Repository

public interface LoginRepository extends JpaRepository<LoginEntity, Integer>{
	
	//the Wrapper class counterpart of the data type of the Primary Key of the Entity
	
	//PK - id 
	//date type of id = int
	//Wrapper class = Integer
	
	//user-defined query
	LoginEntity findByuser(String user);

}