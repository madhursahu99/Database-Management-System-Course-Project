package springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import springmvc.model.Employees;

public class RowMapperImplEmp implements RowMapper<Employees> {
	public Employees mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employees emp=new Employees();
		emp.setEmployeeID(rs.getInt(1));
		emp.setFirstName(rs.getString(2));
		emp.setLastName(rs.getString(3));
		emp.setUsername(rs.getString(10));
		emp.setPassword(rs.getString(11));
		emp.setJoining_date(rs.getString(4));
		emp.setEmail(rs.getString(5));
		emp.setDesignation(rs.getString(6));
		emp.setAadhar_number(rs.getString(7));
		emp.setPhone_number(rs.getString(8));
		emp.setStoreID(rs.getInt(9));
		emp.setSalary(rs.getInt(12));
		
		return emp;
	}

}
