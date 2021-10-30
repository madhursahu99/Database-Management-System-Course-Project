package springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import springmvc.model.Customer;
import springmvc.model.Employees;
import springmvc.model.Owner;

public class RowMapperImpl implements RowMapper<Owner>{

	public Owner mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Owner owner=new Owner();
		owner.setUsername(rs.getString(1));
		owner.setPassword(rs.getString(2));
		
		return owner;
	}
	
}


