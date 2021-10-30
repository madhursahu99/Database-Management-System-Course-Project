package springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import springmvc.model.Customer;
import springmvc.model.Employees;

public class RowMapperImplCust implements RowMapper<Customer>{
	
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
	
		Customer customer=new Customer();
	customer.setCustomerID(rs.getInt(1));
	customer.setFirstName(rs.getString(2));
	customer.setLastName(rs.getString(3));
	customer.setUsername(rs.getString(4));
	customer.setPassword(rs.getString(5));
	customer.setGender(rs.getString(6));
	customer.setEmail(rs.getString(7));
	customer.setPhone_no(rs.getString(8));
	customer.setAddressID(rs.getInt(9));
	customer.setAge(rs.getInt(10));
	
	return customer;
	}

}
