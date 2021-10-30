package springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import springmvc.model.Cart;

public class RowMapperImplCart implements RowMapper<Cart> {

	public Cart mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cart c=new Cart();
		c.setCustomerID(rs.getInt(1));
		c.setMedicineID(rs.getInt(2));
		c.setQuantity(rs.getInt(3));
		c.setPrice(rs.getInt(4));
		c.setStoreID(rs.getInt(5));
		return c;
	}

}
