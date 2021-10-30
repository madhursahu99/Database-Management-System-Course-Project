package springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import springmvc.model.Stores;

public class RowMapperImplSt implements RowMapper<Stores> {

	public Stores mapRow(ResultSet rs, int rowNum) throws SQLException {
		Stores store=new Stores();
		store.setStoreID(rs.getInt(1));
		store.setLicense_number(rs.getString(3));
		store.setAddressID(rs.getInt(2));
		store.setPhone_no(rs.getString(4));
		store.setEmail(rs.getString(5));
		return store;
	}

}
