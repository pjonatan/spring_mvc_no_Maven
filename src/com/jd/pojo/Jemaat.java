package com.jd.pojo;

public class Jemaat {

	private Integer j_id;
	private String no_anggota;
	private String nama;
	private String alamat;
	private String phone;
	private String gender;
	private String darah;
	private String status;
	private String tempat_lahir;
	private String tanggal_lahir;
	private String pendidikan;
	private String pekerjaan;
	
	public Jemaat() {

	}
	
	public Jemaat (Integer j_id, String no_anggota, String nama, String alamat, 
			String phone, String gender, String darah, String status, 
			String tempat_lahir, String tanggal_lahir, String pendidikan, 
			String pekerjaan) {
		this.j_id = j_id;
		this.no_anggota = no_anggota;
		this.nama = nama;
		this.alamat = alamat;
		this.phone = phone;
		this.gender = gender;
		this.darah = darah;
		this.status = status;
		this.tempat_lahir = tempat_lahir;
		this.tanggal_lahir = tanggal_lahir;
		this.pendidikan = pendidikan;
		this.pekerjaan = pekerjaan ;
	}

	public int getJId(){
		return this.j_id;
		}
	
	public void setId(Integer j_id)
	{
		this.j_id = j_id;
	}
	
	public String getNo_anggota(){
		return this.no_anggota;
		}
	
	public void setNo_anggota(String no_anggota)
	{
		this.no_anggota = no_anggota;
	}
	
	public String getNama(){
		return this.nama;
		}
	
	public void setNama(String nama)
	{
		this.nama = nama;
	}

	public String getAlamat(){
		return this.alamat;
		}
	
	public void setAlamat(String alamat)
	{
		this.alamat = alamat;
	}

	public String getPhone(){
		return this.phone;
		}
	
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	
	public String getGender(){
		return this.gender;
		}
	
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	public String getDarah(){
		return this.darah;
		}
	
	public void setDarah(String darah)
	{
		this.darah = darah;
	}
	
	public String getStatus(){
		return this.status;
		}
	
	public void setStatus(String status)
	{
		this.status = status;
	}
	
	public String getTempat_lahir(){
		return this.tempat_lahir;
		}
	
	public void setTempat_lahir(String tempat_lahir)
	{
		this.tempat_lahir = tempat_lahir;
	}

	public String getTanggal_lahir(){
		return this.tanggal_lahir;
		}
	
	public void setTanggal_lahir(String tanggal_lahir)
	{
		this.tanggal_lahir = tanggal_lahir;
	}

	public String getPendidikan(){
		return this.pendidikan;
		}
	
	public void setPendidikan(String pendidikan)
	{
		this.pendidikan = pendidikan;
	}

	public String getPekerjaan(){
		return this.pekerjaan;
		}
	
	public void setPekerjaan(String pekerjaan)
	{
		this.pekerjaan = pekerjaan;
	}  

}
