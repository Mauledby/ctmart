package com.ctmart.sims.Entity;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tbl_student")
public class StudentEntity {

	//Kirk Montejo
	
	//define data members
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String firstname;
	private String lastname;
	private String course;
	private int yearlevel;
	
	@OneToMany(cascade = CascadeType.MERGE)
	private Set<CourseEntity> subject;
	
	public StudentEntity() {}

	public StudentEntity(int id, String firstname, String lastname, String course, int yearlevel,
			Set<CourseEntity> subject) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.course = course;
		this.yearlevel = yearlevel;
		this.subject = subject;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getYearlevel() {
		return yearlevel;
	}

	public void setYearlevel(int yearlevel) {
		this.yearlevel = yearlevel;
	}

	public Set<CourseEntity> getSubject() {
		return subject;
	}

	public void setSubject(Set<CourseEntity> subject) {
		this.subject = subject;
	}

	

	

}
