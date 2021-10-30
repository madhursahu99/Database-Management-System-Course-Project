package springmvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Complaint {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int ComplaintID;
	public String Description;
	public String Complaint_Date;
	public int CustomerID;
	public int OrderID;
	public int getComplaintID() {
		return ComplaintID;
	}
	public void setComplaintID(int complaintID) {
		this.ComplaintID = complaintID;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		this.Description = description;
	}
	public String getComplaint_Date() {
		return Complaint_Date;
	}
	public void setComplaint_Date(String complaint_Date) {
		this.Complaint_Date = complaint_Date;
	}
	public int getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(int customerID) {
		this.CustomerID = customerID;
	}
	public int getOrderID() {
		return OrderID;
	}
	public void setOrderID(int orderID) {
		this.OrderID = orderID;
	}
	
	public Complaint(int complaintID, String description, String complaint_Date, int customerID, int orderID) {
		super();
		this.ComplaintID = complaintID;
		this.Description = description;
		this.Complaint_Date = complaint_Date;
		this.CustomerID = customerID;
		this.OrderID = orderID;
	}
	public Complaint() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
