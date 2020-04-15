package com.jd.map;

import java.sql.ResultSet;
import java.sql.SQLException;
 
import com.jd.pojo.Darah;
import org.springframework.jdbc.core.RowMapper;

public class DarahMapper implements RowMapper<Darah> {
	 
	 @Override
	    public Darah mapRow(ResultSet rs, int rowNum) throws SQLException {
	        Integer GId = rs.getInt("gid");
	        String Golongan = rs.getString("golongan");
	 
	        return new Darah(GId, Golongan);
	    }
}
