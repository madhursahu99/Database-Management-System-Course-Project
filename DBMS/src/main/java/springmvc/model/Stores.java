package springmvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity  
public class Stores {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int StoreID;
	public int AddressID;
	public String License_number;
	public String email;
	public String  Phone_no;
	public int getStoreID() {
		return StoreID;
	}
	public void setStoreID(int storeID) {
		this.StoreID = storeID;
	}
	public int getAddressID() {
		return AddressID;
	}
	public void setAddressID(int addressID) {
		this.AddressID = addressID;
	}
	public String getLicense_number() {
		return License_number;
	}
	public void setLicense_number(String license_number) {
		this.License_number = license_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_no() {
		return Phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.Phone_no = phone_no;
	}
	public Stores() {
		super();
		// TODO Auto-generated constructor stub
	}
}
