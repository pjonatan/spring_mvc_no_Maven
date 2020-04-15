package com.jd.pojo;

public class Darah {
		
	private Integer gid;
	private String golongan;
	
	public Darah() {

	}
	
	public Darah (Integer gid, String golongan) {
		this.gid = gid;
		this.golongan = golongan;
	}

	public int getId(){
		return this.gid;
		}
	
	public void setId(Integer gid)
	{
		this.gid = gid;
	}
	
	public String getGolongan(){
		return this.golongan;
		}
	
	public void setGolongan(String golongan)
	{
		this.golongan = golongan;
	}
}
