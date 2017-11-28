package org.details;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="LOGIN")
public class Login {
	@Id
	private String uname;
	private String password;
	public String getUserName() {
		return uname;
	}
	public void setUserName(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Login() {
		super();
	}

}
