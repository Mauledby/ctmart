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

import com.ctmart.sims.Entity.StudentEntity;
import com.ctmart.sims.Service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

		@Autowired
		StudentService stserv;
	
		//printHello
		@GetMapping("/print")
		public String printHelloStudent() {
			return "Hello Student!";
		}
		
		//C - Create or insert a student record
		@PostMapping("/postStudent")
		public StudentEntity insertStudents(@RequestBody StudentEntity student) {
			return stserv.insertStudents(student);
		}
		
		//R - Read all records
		@GetMapping("/getAllStudents")
		public List<StudentEntity> getAllStudent(){
			return stserv.getAllStudent();
		}
		
		//R - Read records by Firstname
		@GetMapping("/getByFirstname")
		public StudentEntity findByFirstname(@RequestParam String firstname) {
			return stserv.findByFirstname(firstname);
		}
		
		//Update a record
		@PutMapping("/putStudent")
		public StudentEntity putStudent(@RequestParam int id, @RequestBody StudentEntity newStudentDetails) throws Exception{
			return stserv.putStudent(id, newStudentDetails);
		}
		
		//Delete a record
		@DeleteMapping("/deleteStudent/{id}")
		public String deletesStudent(@PathVariable int id) {
			return stserv.deleteStudent(id);
		}
}
