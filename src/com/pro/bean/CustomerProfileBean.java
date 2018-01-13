package com.pro.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomerProfileBean {
	@Autowired UserBean userbean;
	
	private int custId;
	private String DOB;
	private String address;
	private String maritalStatus;
	
	public void setCustId(int custId)
	{
		this.custId=userbean.getUserId();
	}
	
	public int getCustId()
	{
		return custId;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	

}
