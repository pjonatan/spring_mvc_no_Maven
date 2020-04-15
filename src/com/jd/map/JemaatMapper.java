package com.jd.map;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.jd.pojo.Jemaat;
import org.springframework.jdbc.core.RowMapper;

public class JemaatMapper implements RowMapper<Jemaat> {
	 
	 @Override
	    public Jemaat mapRow(ResultSet rs, int rowNum) throws SQLException {
		    Integer JID = rs.getInt("j_id");
	        String No_anggota = rs.getString("no_anggota");
	        String Nama = rs.getString("nama");
	        String Alamat = rs.getString("alamat");
	        String Phone = rs.getString("phone");
	        String Gender = rs.getString("gender");
	        String Darah = rs.getString("darah");
	        String Status = rs.getString("status");
	        String Tempat_lahir = rs.getString("tempat_lahir");
	        String Tanggal_lahir = rs.getString("tanggal_lahir");
	        String Pendidikan = rs.getString("pendidikan");
	        String Pekerjaan = rs.getString("pekerjaan");
	        
	        return new Jemaat(JID, No_anggota, Nama, Alamat, Phone, Gender,  
	        		Darah, Status, Tempat_lahir, Tanggal_lahir, 
	        		Pendidikan, Pekerjaan); 
	    }
}
