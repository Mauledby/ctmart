package com.ctmart.sims.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ctmart.sims.Entity.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{

	//user-defined query
	StudentEntity findByFirstname(String firstname);
}
