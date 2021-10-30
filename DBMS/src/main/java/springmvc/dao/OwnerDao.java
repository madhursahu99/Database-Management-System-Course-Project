package springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.Pharmacist;
import springmvc.model.Stores;
import springmvc.model.Complaint;
import springmvc.model.Customer;
import springmvc.model.Employees;
import springmvc.model.Owner;


@Repository
public class OwnerDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Owner loginOwner(Owner owner) {
		
		String s1=owner.getUsername();
		String s2=owner.getPassword();
		String q="select * from owner where username=? and password=?";
		
		RowMapper<Owner> rowMapper=new RowMapperImpl();
		
		try {
			Owner o=this.jdbcTemplate.queryForObject(q,rowMapper,s1,s2);
			return o;
		} catch (Exception e) {
			return null;
		}
			
	}
	
	public int addEmp(Employees emp) {
		
		String q="insert into Employees(FirstName,LastName,username,password,joining_date,Designation,StoreID,aadhar_number,phone_number,email,salary) values(?,?,?,?,?,?,?,?,?,?,?)";
		
		int  id=(Integer) this.jdbcTemplate.update(q,emp.getFirstName(),emp.getLastName(),emp.getUsername(),emp.getPassword(),emp.getJoining_date(),emp.getDesignation(),emp.getStoreID(),emp.getAadhar_number(),emp.getPhone_number(),emp.getEmail(),emp.getSalary());
		
		return id;
		
	}

	public List<Employees> showall() {
		// TODO Auto-generated method stub
		String q="Select * from employees";
		RowMapper<Employees> r = new RowMapperImplEmp(); 
		try {
			List<Employees> e=this.jdbcTemplate.query(q,r);
			return e;
		} catch (Exception e) {
			return null;
		}
	}

	public int upd_sal(int id,int salary) {
		// TODO Auto-generated method stub
		String q="update Employees set salary=? where EmployeeID=?";
		try {
			this.jdbcTemplate.update(q,salary,id);
			return 1;
			
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
	}

	public int del_emp(int id) {
		// TODO Auto-generated method stub
		String q="delete from Employees where EmployeeID=?";
		
		try {
			this.jdbcTemplate.update(q,id); 
			return 1;
			
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
	}

	public List<Employees> showallbs(int sid) {
		// TODO Auto-generated method stub
		String q="Select * from employees where StoreID=?";
		RowMapper<Employees> r=new RowMapperImplEmp();
		try {
			List<Employees> e=this.jdbcTemplate.query(q,r,sid);
			return e;
		} catch (Exception e) {
			return null;
		}
	}

	public Employees searchbyid(int id) {
		String q="select * from Employees where EmployeeID=?";
		RowMapper<Employees> r=new RowMapperImplEmp();
		try {
			Employees emp=this.jdbcTemplate.queryForObject(q,r,id);
			return emp;
		}catch(Exception e) {
			return null;
		}
	}

	public List<Complaint> showcom() {
		String q="select * from complaint";
		RowMapper<Complaint> r=new RowMapperImplCom();
		List<Complaint> com=this.jdbcTemplate.query(q, r);
		return com;
	}

	public List<Pharmacist> showpha() {
		String q="select * from pharmacist";
		RowMapper<Pharmacist> r=new RowMapperImplPhar();
		List<Pharmacist> pha=this.jdbcTemplate.query(q, r);
		return pha;
	}

	public void addstore(Stores store) {
		String q="insert into stores (License_number,phone_no,email,addressid) values(?,?,?,1)";
		this.jdbcTemplate.update(q,store.getLicense_number(),store.getPhone_no(),store.getEmail());
		return ;
		
	}

	public Integer addpha(Pharmacist pha) {
String q="insert into pharmacist(FirstName,LastName,username,password,joining_date,StoreID,Reg_no,phone_no,email,salary) values(?,?,?,?,?,?,?,?,?,?)";
		
		int  id=(Integer) this.jdbcTemplate.update(q,pha.getFirstname(),pha.getLastname(),pha.getUsername(),pha.getPassword(),pha.getJoining_date(),pha.getStoreID(),pha.getReg_No(),pha.getPhone_no(),pha.getEmail(),pha.getSalary());
		
		return id;
		
	}

}
