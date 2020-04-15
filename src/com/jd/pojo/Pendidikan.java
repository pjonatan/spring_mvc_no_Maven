package com.jd.pojo;

public class Pendidikan {

	private Integer d_id;
	private String pendidikan;
	
	public Pendidikan() {

	}
	
	public Pendidikan (Integer d_id, String pendidikan) {
		this.d_id = d_id;
		this.pendidikan = pendidikan;
	}

	public int getD_Id(){
		return this.d_id;
		}
	
	public void setId(Integer d_id)
	{
		this.d_id = d_id;
	}
	
	public String getPendidikan(){
		return this.pendidikan;
		}
	
	public void setPendidikan(String pendidikan)
	{
		this.pendidikan = pendidikan;
	}
}
