package springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import springmvc.model.Address;
import springmvc.model.Cart;
import springmvc.model.Complaint;
import springmvc.model.Customer;
import springmvc.model.Medicine;
import springmvc.model.Orders;
import springmvc.model.Owner;
import springmvc.model.Stores;

@Repository 
public class CustomerDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public int saveCustomer(String fname,String lname,String uname,String encpword,String gender,int age,String pno,String email)
	{
		String q="insert into Customers(FirstName,LastName,username,password,gender,email,phone_no,age,addressid) values(?,?,?,?,?,?,?,?,1)";
		int  id=(Integer) this.jdbcTemplate.update(q,fname,lname,uname,encpword,gender,email,pno,age);
		return id;
	}
	
	public Customer login(String uname, String pword) {
		System.out.println(uname + " " + pword);
		String q="select * from customers where username=? and password=?";
		RowMapper<Customer> r=new RowMapperImplCust();
		try {
			Customer c=this.jdbcTemplate.queryForObject(q,r,uname,pword);
			System.out.println(c);
			return c;
		} catch (Exception e) {
			System.out.println("A");
			return null;
		}
				
	}

	public void file_com(Complaint com,int cid) {
		String q="insert into Complaint(Description,CustomerId,OrderID,complaint_Date) values(?,?,?,?)";
		this.jdbcTemplate.update(q,com.getDescription(),cid,com.getOrderID(),com.getComplaint_Date());
		
	}

	public List<Stores> showstores() {
		String q="select * from Stores";
		RowMapper<Stores> r=new RowMapperImplSt();
		
		try {
			List<Stores> st=this.jdbcTemplate.query(q,r);
			return st;
			
		} catch (Exception e) {
			return null;
		}   
	}

	public int atc(int cid, int mid, int q, int tprice, int sid) {
		// TODO Auto-generated method stub
		System.out.println("m");
		String qu="insert into cart (customerid,medicineid,quantity,price,storeid) values(?,?,?,?,?)";
		try {
			int i=this.jdbcTemplate.update(qu,cid,mid,q,tprice,sid);
			System.out.println("m");
			return i;
		} catch (Exception e) {
			return 0;
		}
		
	}

	public Medicine searchmedbyid(int mid) {
		System.out.println("p");
		String q="select * from medicine where medicineid=?";
		RowMapper<Medicine> r=new RowMapperImplMed();
		
		try {
			Medicine m=this.jdbcTemplate.queryForObject(q,r,mid);
			return m;
			
		} catch (Exception e) {
			return null;
		}
		
	}

	public List<Cart> showcart(Integer attribute) {
		String q="select * from cart where customerid=?";
		RowMapper<Cart> r=new RowMapperImplCart();
		try {
			List<Cart> car=this.jdbcTemplate.query(q, r, attribute);
			return car;
			
		} catch (Exception e) {
			return null;
		}
		
	}

	public void delfromcart(int mid, int cid) {
		String q="delete from cart where medicineid=? and customerid=?";
		this.jdbcTemplate.update(q,mid,cid);
		return;
	}

	public void emptycart(int id) {
		String q="delete from cart where CustomerID=?";
		this.jdbcTemplate.update(q,id);
		return;
		
	}

	public void movetoorders(int cid, int mid, int qu, int sid,
			int price) {
		String q="insert into orders(customerid,medicineid,quantity,storeID,Total_amount) values(?,?,?,?,?)";
		this.jdbcTemplate.update(q,cid,mid,qu,sid,price);
		return;
		
	}

	public List<Orders> vieworder(int id) {
		String q="Select * from orders where customerid=?";
		RowMapper<Orders> r=new RowMapperImplOrder();
		try {
			System.out.println("m");
			List<Orders> o=this.jdbcTemplate.query(q,r,id);
			return o;
			
		} catch (Exception e) {
			return null;
		}
	}

	public void atcexist(int cid, int mid,  int q, int tprice, int sid, int price2) {
			
		String qu1="Select * from cart where customerid=? and medicineid=?";
		RowMapper<Cart> r=new RowMapperImplCart();
		Cart cart=this.jdbcTemplate.queryForObject(qu1,r,cid,mid);
		int qty=cart.getQuantity();
		int price=cart.getPrice();
		price=price+(q*price2);
		qty=qty+q;
		String qu="update Cart set quantity=?,price=? where customerid=? and medicineid=?";
		this.jdbcTemplate.update(qu,qty,price,cid,mid);
		return;
	}

	public List<Customer> checkforemail(String email) {
		String q="select * from customers where email=?";
		RowMapper<Customer> r=new RowMapperImplCust();
		try {
			List<Customer> c=this.jdbcTemplate.query(q, r,email);
			return c;
		} catch (Exception e) {
			return null;
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		
	}

	public int saveaddress(Address ad) {
		String q="insert into address (Plot_no,street_name,landmark,city,state) values(?,?,?,?,?)";
		this.jdbcTemplate.update(q,ad.getPlot_no(),ad.getStreet_name(),ad.getLandmark(),ad.getCity(),ad.getState());
		String q1="select * from address where plot_no=? and street_name=? and city=? and state=?";
		RowMapper<Address> r=new RowMapperImplAdd();
		Address add=this.jdbcTemplate.queryForObject(q1, r, ad.getPlot_no(),ad.getStreet_name(),ad.getCity(),ad.getState());
		int addid=add.getAddressID();
		
		return addid;
	}

	public void insertaddid(int addid,int cid) {
		// TODO Auto-generated method stub
		String q="update customers set addressid=? where customerid=?";
		this.jdbcTemplate.update(q, addid,cid);
		return;
	}

	public Customer getcust(int cid) {
		// TODO Auto-generated method stub
		String q="Select * from customers where customerid=?";
		RowMapper<Customer> r=new RowMapperImplCust();
			Customer c=this.jdbcTemplate.queryForObject(q, r, cid);
		return c;
	}

	public Address getadd(int addid) {
		String q="select * from address where addressid=?";
		RowMapper<Address> r=new RowMapperImplAdd();
		Address add=this.jdbcTemplate.queryForObject(q, r, addid);
		return add;
	}

	public int updaddress(Address ad ,int addid) {
		
		String q="update address set plot_no=? , street_name=? , landmark=? , city=? , state=? where addressid=?";
		this.jdbcTemplate.update(q, ad.getPlot_no(),ad.getStreet_name(),ad.getLandmark(),ad.getCity(),ad.getState(),addid);
		// TODO Auto-generated method stub
		return 1;
	}

	public int updcustprofile(String fname, String lname, String age, String ph, String uname, int cid) {
		String q="update customers set firstname=? ,lastname=? ,age=?,phone_no=? ,username=? where customerid=?";
		this.jdbcTemplate.update(q,fname,lname,age,ph,uname,cid);
		return 0;
	}


}
