package springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import springmvc.model.Orders;

public class RowMapperImplOrder implements RowMapper<Orders> {

	public Orders mapRow(ResultSet rs, int rowNum) throws SQLException {
		Orders o=new Orders();
		o.setCustomerid(rs.getInt(1));
		o.setOrderid(rs.getInt(2));
		o.setTotal_amount(rs.getInt(3));
		o.setStoreID(rs.getInt(4));
		o.setMedicineID(rs.getInt(5));
		o.setQuantity(rs.getInt(6));
		
		return o;
	}

}
