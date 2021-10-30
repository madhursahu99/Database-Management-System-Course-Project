package springmvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Medicine {

	@Override
	public String toString() {
		return "Medicine [MedicineId=" + MedicineId + ", medicine_Name=" + medicine_Name + ", ProviderID=" + ProviderID
				+ ", Company_Name=" + Company_Name + ", mfg_date=" + mfg_date + ", Expiry_date=" + Expiry_date
				+ ", Price=" + Price + ", Dose_per_day=" + Dose_per_day + ", StoreID=" + StoreID + "]";
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int MedicineId; 
	public String medicine_Name;
	public int ProviderID;
	public String Company_Name;
	public String mfg_date;
	public String Expiry_date;
	public int Price;
	public int Dose_per_day;
	public int StoreID;
	public int getStoreID() {
		return StoreID;
	}
	public void setStoreID(int storeID) {
		this.StoreID = storeID;
	}
	public int getMedicineId() {
		return MedicineId;
	}
	public void setMedicineId(int medicineId) {
		this.MedicineId = medicineId;
	}
	public String getMedicine_Name() {
		return medicine_Name;
	}
	public void setMedicine_Name(String medicine_Name) {
		this.medicine_Name = medicine_Name;
	}
	public int getProviderID() {
		return ProviderID;
	}
	public void setProviderID(int ProviderID) {
		this.ProviderID = ProviderID;
	}
	public String getCompany_Name() {
		return Company_Name;
	}
	public void setCompany_Name(String company_Name) {
		this.Company_Name = company_Name;
	}
	public String getMfg_date() {
		return mfg_date;
	}
	public void setMfg_date(String mfg_date) {
		this.mfg_date = mfg_date;
	}
	public String getExpiry_date() {
		return Expiry_date;
	}
	public void setExpiry_date(String expiry_date) {
		this.Expiry_date = expiry_date;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		this.Price = price;
	}
	public int getDose_per_day() {
		return Dose_per_day;
	}
	public void setDose_per_day(int dose_per_day) {
		this.Dose_per_day = dose_per_day;
	}
	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}
}
