package com.ctmart.sims.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctmart.sims.Entity.StudentEntity;
import com.ctmart.sims.Repository.StudentRepository;

@Service
public class StudentService {
	/* this class contains all the business logic of your system
	 * Create a student Record
	 * Read student record/s by id or firstname
	 * Update a student record
	 * Delete a student
	 */
	
	@Autowired
	StudentRepository srepo;
	
	
	//C - Create or insert a student record
	public StudentEntity insertStudents(StudentEntity student) {
		return srepo.save(student);
	}
	
	
	//R- Read all reocords from tbl_student
	public List<StudentEntity> getAllStudent(){
		return srepo.findAll();
	}
	
	//R- Read or search record by firstname
	public StudentEntity findByFirstname(String firstname) {
			if(srepo.findByFirstname(firstname)!=null)
				return srepo.findByFirstname(firstname);
			else
				return null;
	}
	//U - Update a student record
	
	public StudentEntity putStudent(int id, StudentEntity newStudentDetails) throws Exception{
		StudentEntity student = new StudentEntity();
		
		try {
			//steps in updating
			//Step 1 - search the id number of the student
			student = srepo.findById(id).get(); //findById() is a pre-defiened method
			
			//Step 2 - update the record 
			student.setCourse(newStudentDetails.getCourse());
			student.setYearlevel(newStudentDetails.getYearlevel());
			
			//Step 3 - save the information and return the value
			return srepo.save(student);
			
			}catch(NoSuchElementException nex) {
				throw new Exception("ID Number "+ id + " does not exist");
			}
	}
	
	//D - Delete Student record
	public String deleteStudent(int id) {
		String msg;
		if(srepo.findById(id)!=null) {
			srepo.deleteById(id);
			msg = "Student ID Number "+id+" is successfully deleted!";
		}
		else
			msg = "Student ID Number" + id + " is NOT found!";
		
		return msg;
	}
	
}


