package com.pro.bean;

import java.util.Date;

import javax.validation.constraints.Size;

public class UserBean {
	@Size(min=2,max=7)
	private int userId;
	private String userName;
	private String gender;
	public Date date;
	
	public String getGender()
	{
		return gender;	
	}
	
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setDate(Date date) {
		date = this.date;
	}
	
	public Date getDate()
	{
		return date;
	}
	
}
