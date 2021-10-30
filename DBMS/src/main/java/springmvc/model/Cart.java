package springmvc.model;

import javax.persistence.Entity;

@Entity
public class Cart {
	
	public int customerID;
	public int MedicineID;
	public int Price;
	public int Quantity;
	public int StoreID;
	public int getStoreID() {
		return StoreID;
	}
	public void setStoreID(int storeID) {
		this.StoreID = storeID;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getMedicineID() {
		return MedicineID;
	}
	public void setMedicineID(int medicineID) {
		this.MedicineID = medicineID;
	}
	
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		this.Price = price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		this.Quantity = quantity;
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(int customerID, int medicineID, String medicine_Name, int price, int quantity) {
		super();
		this.customerID = customerID;
		MedicineID = medicineID;
		Price = price;
		Quantity = quantity;
	}
}
