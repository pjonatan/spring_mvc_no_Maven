package com.jd.map;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.jd.pojo.Pendidikan;

public class PendidikanMapper implements RowMapper<Pendidikan> {

	 @Override
	    public Pendidikan mapRow(ResultSet rs, int rowNum) throws SQLException {
	        Integer D_Id = rs.getInt("d_id");
	        String Pendidikan = rs.getString("pendidikan");
	 
	        return new Pendidikan(D_Id, Pendidikan);
	    }	
}
