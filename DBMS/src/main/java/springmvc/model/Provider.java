package springmvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity  
public class Provider {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int ProviderID;
	public String Provider_Name;
	public String phone_no;
	public String email;
	public int getProviderID() {
		return ProviderID;
	}
	public void setProviderID(int providerID) {
		ProviderID = providerID;
	}
	public String getProvider_Name() {
		return Provider_Name;
	}
	public void setProvider_Name(String provider_Name) {
		Provider_Name = provider_Name;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Provider() {
		super();
		// TODO Auto-generated constructor stub
	}
}
