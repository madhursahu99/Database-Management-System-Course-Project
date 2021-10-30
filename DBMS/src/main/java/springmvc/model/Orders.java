package springmvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orders {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int orderid;
	public int customerid;
	public int total_amount;
	public int medicineID;
	public String Medicine_name;
	public int quantity;
	public int StoreID;
	public int getStoreID() {
		return StoreID;
	}
	public void setStoreID(int storeID) {
		this.StoreID = storeID;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public int getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(int total_amount) {
		this.total_amount = total_amount;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMedicineID() {
		return medicineID;
	}
	public void setMedicineID(int medicineID) {
		this.medicineID = medicineID;
	}
	public String getMedicine_name() {
		return Medicine_name;
	}
	public void setMedicine_name(String medicine_name) {
		this.Medicine_name = medicine_name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Orders(int orderid, int customerid, int total_amount) {
		super();
		this.orderid = orderid;
		this.customerid = customerid;
		this.total_amount = total_amount;
	}
	@Override
	public String toString() {
		return "Orders [orderid=" + orderid + ", customerid=" + customerid + ", total_amount=" + total_amount + "]";
	}
	
	
}
