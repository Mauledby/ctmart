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

import com.ctmart.sims.Entity.CourseEntity;
import com.ctmart.sims.Service.CourseService;


@RestController
@RequestMapping("/course")

public class CourseController {
	
	@Autowired
	CourseService crserv;
	
	
	//printHelloStudent
	@GetMapping("/print")
	public String printHelloStudent() {
		return "Hello, Student!";
	}
	
	//Create or insert a course record
	@PostMapping("/postCourse")
	public CourseEntity insertCourse(@RequestBody CourseEntity course) {
		return crserv.insertCourse(course);
	}
	
	//Read all records
	@GetMapping("/getAllCourse")
	public List<CourseEntity> getAllCourse() {
		return crserv.getAllCourse();
		
	}
	
	//R - Read records by code
	@GetMapping("/getByCode")
	public CourseEntity findByCode(@RequestParam String code) {
		return crserv.findByCode(code);
	}
	
	//Update a record
	@PutMapping("/putCourse")
	public CourseEntity putCourse(@RequestParam int courseid, @RequestBody CourseEntity newCourseDetails) throws Exception{
		return crserv.putCourse(courseid, newCourseDetails);
	}
	
	
	//Delete a record
	@DeleteMapping("/deleteCourse/{courseid}")
	public String deletesCourse(@PathVariable int courseid) {
		return crserv.deleteCourse(courseid);
	}
	
	

	
}