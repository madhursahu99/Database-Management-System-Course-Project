package springmvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pharmacist {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int PharmacistID;
	public int StoreID;
	public String Reg_No;
	public String firstname;
	public String lastname;
	public String joining_date;
	public String username;
	@Override
	public String toString() {
		return "Pharmacist [PharmacistID=" + PharmacistID + ", StoreID=" + StoreID + ", Reg_No=" + Reg_No
				+ ", firstname=" + firstname + ", lastname=" + lastname + ", joining_date=" + joining_date
				+ ", username=" + username + ", password=" + password + ", salary=" + salary + ", email=" + email
				+ ", phone_no=" + phone_no + "]";
	}
	public String password;
	public int salary;
	public String email;
	public String phone_no;
	
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
	public String getJoining_date() {
		return joining_date;
	}
	public void setJoining_date(String joining_date) {
		this.joining_date = joining_date;
	}
	public String getUsername() {
		return username;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public Pharmacist() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPharmacistID() {
		return PharmacistID;
	}
	public void setPharmacistID(int pharmacistID) {
		this.PharmacistID = pharmacistID;
	}
	public int getStoreID() {
		return StoreID;
	}
	public void setStoreID(int storeID) {
		this.StoreID = storeID;
	}
	public String getReg_No() {
		return Reg_No;
	}
	public void setReg_No(String reg_No) {
		this.Reg_No = reg_No;
	}

}
