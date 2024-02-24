package com.infogalaxy.studentIMP;

public class StudentModel 
{
	private String prnid;
	private String name;
	private String rollno;
	private String mobno;
	private String add;
	
	public void setPRNID(String prnid)
	{
		this.prnid = prnid;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setRollNo(String rollno)
	{
		this.rollno = rollno;
	}
	public void setMobilNo(String mobno)
	{
		this.mobno = mobno;
	}
	public void setAddress(String add)
	{
		this.add = add;
	}
	
	public  String getPRNID() 
	{
		return this.prnid;
	}
	public String getName()
	{
		return this.name;
	}
	public String getRollNO()
	{
		return this.rollno;
	}
	public String getMobilNo()
	{
		return this.mobno;
	}
	public String getAddress()
	{
		return this.add;
	}
}

