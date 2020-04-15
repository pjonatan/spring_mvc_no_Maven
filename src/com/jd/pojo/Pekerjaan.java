package com.jd.pojo;

public class Pekerjaan {

	private Integer ja_id;
	private String pekerjaan;
	
	public Pekerjaan() {

	}
	
	public Pekerjaan(Integer ja_id, String pekerjaan) {
		this.ja_id = ja_id;
		this.pekerjaan = pekerjaan;
	}

	public int getJA_Id(){
		return this.ja_id;
		}
	
	public void setJAId(Integer ja_id)
	{
		this.ja_id = ja_id;
	}
	
	public String getPekerjaan(){
		return this.pekerjaan;
		}
	
	public void setPekerjaan(String pekerjaan)
	{
		this.pekerjaan= pekerjaan;
	}
}
