package springmvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import springmvc.model.Medicine;
import springmvc.model.Orders;
import springmvc.model.Employees;

@Repository      
public class EmployeeDao {
	
	@Autowired 
	private JdbcTemplate jdbcTemplate;

	public Employees login(String uname, String pword) {
		String q="select * from Employees where username=? and password=?";
		RowMapper<Employees>  r= new RowMapperImplEmp();
		try {
			Employees emp=this.jdbcTemplate.queryForObject(q,r,uname,pword);
			return emp;
			
		} catch (Exception e) {
			return null;
		} 
	}

	public List<Medicine> showallmed() {
		String q="select * from Medicine";
		RowMapper<Medicine> r = new RowMapperImplMed(); 
		try {
			List<Medicine> med=this.jdbcTemplate.query(q,r);
			return med;
		} catch (Exception e) {
			return null;
		}
	}

	public List<Medicine> showallmedbs(int sid) {
		String q="select * from medicine where storeid=?";
		RowMapper<Medicine> r=new RowMapperImplMed();
		try {
			List<Medicine> med=this.jdbcTemplate.query(q,r,sid);
			return med;
		} catch (Exception e) {
			return null;
		}
	}

	public int upd_price(int id, int price) {
		String q="update medicine set price=? where medicineID=?";
		try {
			this.jdbcTemplate.update(q,price,id);
			return 1;
			
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
		
	}

	public int del_med(int id) {
		String q="delete from medicine where MedicineID=?";
		try {
			this.jdbcTemplate.update(q,id); 
			return 1;
			
		} catch (Exception e) {
			return 0;
		}
	}

	public Integer addmed(Medicine med) {
		String q="insert into medicine(Medicine_name,Company_name,Providerid,mfg_date,expiry_date,Price,Dose_per_day,StoreID) values(?,?,?,?,?,?,?,?)";
		int  id=(Integer) this.jdbcTemplate.update(q,med.getMedicine_Name(),med.getCompany_Name(),med.getProviderID(),med.getMfg_date(),med.getExpiry_date()
				 ,med.getPrice(),med.getDose_per_day(),med.getStoreID());
		return id;
	}

	public Medicine searchmedbyid(int id) {
		String q="select * from medicine where medicineID=?";
		RowMapper<Medicine> r=new RowMapperImplMed();
		try {
			Medicine med=this.jdbcTemplate.queryForObject(q,r,id);
			return med;
		}catch(Exception e) {
			return null;
		}
	}

	public List<Orders> storeorders(int sid) {
		String q="select * from orders where storeid=?";
		RowMapper<Orders> r=new RowMapperImplOrder();
		try {
			List<Orders> o=this.jdbcTemplate.query(q, r, sid);
			return o;
			
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	public Employees getprofile(int id) {
		String q="select * from employees where employeeID=?";
		RowMapper<Employees> r=new RowMapperImplEmp();
		try {
			Employees emp=this.jdbcTemplate.queryForObject(q, r, id);
			return emp;
			
		}catch(Exception e){
			return null;
		}
	}

	public void updprofile(int id, String fname, String lname, String email, String uname, String ph,
			String jdate) {
		String q="update employees set firstname=? ,lastname=? ,email=? ,username=? ,phone_number=? ,joining_date=? where employeeid=?";
		this.jdbcTemplate.update(q,fname,lname,email,uname,ph,jdate,id);
		return;
	}
}
