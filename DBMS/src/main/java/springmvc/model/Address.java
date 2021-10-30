package springmvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	
	@Override
	public String toString() {
		return "Address [AddressID=" + AddressID + ", Plot_no=" + Plot_no + ", street_name=" + street_name + ", city="
				+ city + ", landmark=" + landmark + ", state=" + state + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int AddressID;
	public int Plot_no;
	public String street_name;
	public String city;
	public String landmark; 
	public String state;
	public int getAddressID() {
		return AddressID;
	}
	public void setAddressID(int addressID) {
		this.AddressID = addressID;
	}
	public int getPlot_no() {
		return Plot_no;
	}
	public void setPlot_no(int plot_no) {
		this.Plot_no = plot_no;
	}
	public String getStreet_name() {
		return street_name;
	}
	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
}
