package org.details;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity(name="USER")
@Table(name = "USER_STATUS")
public class Userstatus {
	@Id
	@GeneratedValue
	private Integer candidateid;
	
	@Column(name="INTERVIEW ID")
	private String interviewid;
	
	@Column(name="INTERVIEW TYPE")
	private String interviewtype;
	
	@Column(name="INTERVIEW DATE")
	private String interviewdate;
	
	
}