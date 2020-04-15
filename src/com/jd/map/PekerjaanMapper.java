package com.jd.map;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.jd.pojo.Pekerjaan;
import org.springframework.jdbc.core.RowMapper;

public class PekerjaanMapper implements RowMapper<Pekerjaan> {

	 @Override
	    public Pekerjaan mapRow(ResultSet rs, int rowNum) throws SQLException {
	        Integer JA_Id = rs.getInt("ja_id");
	        String Pekerjaan = rs.getString("pekerjaan");
	 
	        return new Pekerjaan(JA_Id, Pekerjaan);
	    }	
}
