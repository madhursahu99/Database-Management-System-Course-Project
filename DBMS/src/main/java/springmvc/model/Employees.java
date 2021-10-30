package springmvc.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Employees {
	
	@Override
	public String toString() {
		return "Employees [employeeID=" + employeeID + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", email=" + email + ", joining_date=" + joining_date + ", designation=" + designation
				+ ", aadhar_number=" + aadhar_number + ", phone_number=" + phone_number + ", StoreID=" + StoreID
				+ ", username=" + username + ", password=" + password + ", salary=" + salary + "]";
	}
	
	public int  employeeID;
	public String firstname;
	public String lastname;
	public String email;
	public String joining_date;
	public String designation;
	public String aadhar_number;
	public String phone_number;
	public int StoreID;
	public String username;
	public String password;
	public int salary;
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getFirstName() {
		return firstname;
	}
	public void setFirstName(String firstName) {
		this.firstname = firstName;
	}
	public String getLastName() {
		return lastname;
	}
	public void setLastName(String lastName) {
		this.lastname = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getJoining_date() {
		return joining_date;
	}
	public void setJoining_date(String joining_date) {
		this.joining_date = joining_date;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getAadhar_number() {
		return aadhar_number;
	}
	public void setAadhar_number(String aadhar_number) {
		this.aadhar_number = aadhar_number;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public int getStoreID() {
		return StoreID;
	}
	public void setStoreID(int storeID) {
		this.StoreID = storeID;
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
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employees(int employeeID, String firstname, String lastname, String email, String joining_date,
			String designation, String aadhar_number, String phone_number, int storeID, String username,
			String password, int salary) {
		super();
		this.employeeID = employeeID;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.joining_date = joining_date;
		this.designation = designation;
		this.aadhar_number = aadhar_number;
		this.phone_number = phone_number;
		this.StoreID = storeID;
		this.username = username;
		this.password = password;
		this.salary = salary;
	}
	
	
}
