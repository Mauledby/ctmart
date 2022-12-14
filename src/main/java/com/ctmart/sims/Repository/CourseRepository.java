package com.ctmart.sims.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ctmart.sims.Entity.CourseEntity;



@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, Integer>{

	//user-defined query
	CourseEntity findByCode(String code);
}

