package com.ctmart.sims.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_course")
public class CourseEntity {

	//Kirk Montejo
	
	//define data members
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseid;
	
	private String code;
	private String title;
	private int unit;
	
	@ManyToOne
	@JoinColumn(name = "id")
	StudentEntity student;
	

	public CourseEntity() {}


	public CourseEntity(int courseid, String code, String title, int unit, StudentEntity student) {
		super();
		this.courseid = courseid;
		this.code = code;
		this.title = title;
		this.unit = unit;
		this.student = student;
	}


	public int getCourseid() {
		return courseid;
	}


	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getUnit() {
		return unit;
	}


	public void setUnit(int unit) {
		this.unit = unit;
	}


	public StudentEntity getStudent() {
		return student;
	}


	public void setStudent(StudentEntity student) {
		this.student = student;
	}
	

}
	
	
	
