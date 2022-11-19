package com.ctmart.sims.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctmart.sims.Entity.CourseEntity;
import com.ctmart.sims.Repository.CourseRepository;

@Service
public class CourseService {
	
	
	@Autowired
	CourseRepository crepo;
	
	//C - Create or insert a COURSE
	public CourseEntity insertCourse(CourseEntity course) {
		return crepo.save(course);
	}
	
	
	//R - Read all records from tbl_course
	public List<CourseEntity> getAllCourse(){
		return crepo.findAll();
	}
	
	
	public CourseEntity findByCode(String code) {
		if(crepo.findByCode(code)!=null)
			return crepo.findByCode(code);
		else
			return null;
}
	
	public CourseEntity putCourse(int courseid, CourseEntity newCourseDetails) throws Exception{
		CourseEntity course = new CourseEntity();
		
		try {
			//steps in updating
			//Step 1 - search the id number of the student
			course = crepo.findById(courseid).get(); //findById() is a pre-defiened method
			
			//Step 2 - update the record 
			course.setCode(newCourseDetails.getCode());
			course.setTitle(newCourseDetails.getTitle());
			course.setUnit(newCourseDetails.getUnit());
			
			//Step 3 - save the information and return the value
			return crepo.save(course);
			
			}catch(NoSuchElementException nex) {
				throw new Exception("Course: "+ courseid + " does not exist");
			}
	}
	
	//D - Delete Course record
	public String deleteCourse(int courseid) {
		String msg;
		if(crepo.findById(courseid)!=null) {
			crepo.deleteById(courseid);
			msg = "Course ID Number "+courseid+" is successfully deleted!";
		}
		else
			msg = "Course ID Number" + courseid + " is NOT found!";
		
		return msg;
	}
	
}