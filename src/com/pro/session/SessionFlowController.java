package com.pro.session;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;

import com.pro.bean.UserBean;

@Scope(value="session")
public class SessionFlowController implements Serializable{
	
	public UserBean userbean;
	private int userId;
	private String userName;
	
	
	
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

	public void setDetails(UserBean userbean)
	{
		userbean=this.userbean;
	}
	
	public UserBean getDetails()
	{
		return userbean;
	}
	

}
