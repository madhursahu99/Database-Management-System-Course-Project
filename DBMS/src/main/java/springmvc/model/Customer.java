package springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//@Column(name="CustomerID")
	private int CustomerID;
	//@Column(name="FirstName")
	private String FirstName;
	//@Column(name="LastName")
	private String LastName;
	//@Column(name="username")
	private String username;
	//@Column(name="password")
	private String password;
	//@Column(name="gender")
	private String gender;
	private int age;
	private int AddressID;
	private String phone_no;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAddressID() {
		return AddressID;
	}
	public void setAddressID(int addressID) {
		this.AddressID = addressID;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public int getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(int customerID) {
		this.CustomerID = customerID;
	}

	//@Column(name="email")
	private String email;
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		this.LastName = lastName;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [CustomerID=" + CustomerID + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", username=" + username + ", password=" + password + ", gender=" + gender + ", age=" + age
				+ ", AddressID=" + AddressID + ", phone_no=" + phone_no + ", email=" + email + "]";
	}
	public Customer(int customerID, String firstName, String lastName, String username, String password, String gender,
			int age, int addressID, String phone_no, String email) {
		super();
		this.CustomerID = customerID;
		this.FirstName = firstName;
		this.LastName = lastName;
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.age = age;
		this.AddressID = addressID;
		this.phone_no = phone_no;
		this.email = email;
	}
	
	
	
	

}
