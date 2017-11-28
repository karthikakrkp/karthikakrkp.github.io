package org.details;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity(name="USER")
@Table(name = "USER_QUALIFICATIONS")
public class UserQua {
	@Id
	@GeneratedValue
	private Integer candidateid;
	
	@Column(name="DEGREE")
	private String degree;
	
	@Column(name="STREAM")
	private String stream;
	
	@Column(name="UNIVERSITY")
	private String university;
	
	@Column(name="YEAR PASSED")
	private String yearpassed;
	
	@Column(name="CGPA")
	private double cgpa;
	
	
	


	public Integer getCandidateid() {
		return candidateid;
	}


	public void setCandidateid(Integer candidateid) {
		this.candidateid = candidateid;
	}


	public String getDegree() {
		return degree;
	}


	public void setDegree(String degree) {
		this.degree = degree;
	}


	public String getStream() {
		return stream;
	}


	public void setStream(String stream) {
		this.stream = stream;
	}


	public String getUniversity() {
		return university;
	}


	public void setUniversity(String university) {
		this.university = university;
	}


	public String getYearpassed() {
		return yearpassed;
	}


	public void setYearpassed(String yearpassed) {
		this.yearpassed = yearpassed;
	}


	public double getCgpa() {
		return cgpa;
	}


	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}


	public UserQua() {
		super();
	}

	
}
