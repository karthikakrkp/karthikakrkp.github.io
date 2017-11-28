package org.details;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SIGNUP")
public class Signup {
	@Id
	//private String name;
	private String uname;
	private String password;
	private String emailId;
	
	/*public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}*/

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Signup() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
