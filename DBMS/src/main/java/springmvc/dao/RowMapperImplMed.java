package springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import springmvc.model.Medicine;

public class RowMapperImplMed implements RowMapper<Medicine> {

	public Medicine mapRow(ResultSet rs, int rowNum) throws SQLException {
		Medicine med=new Medicine();
		med.setMedicineId(rs.getInt(1));
		med.setMedicine_Name(rs.getString(2));
		med.setCompany_Name(rs.getString(3));
		med.setProviderID(rs.getInt(9));
		med.setMfg_date(rs.getString(4));
		med.setExpiry_date(rs.getString(5));
		med.setPrice(rs.getInt(6));
		med.setDose_per_day(rs.getInt(7));
		med.setStoreID(rs.getInt(8));
		
		return med;
	}

}
