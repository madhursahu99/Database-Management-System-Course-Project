package springmvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity      
public class Owner {
	
	@Id
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	
	@Override
	public String toString() {
		return "Owner [username=" + username + ", password=" + password + "]";
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
