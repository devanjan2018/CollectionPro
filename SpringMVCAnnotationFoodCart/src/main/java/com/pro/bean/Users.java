package com.pro.bean;

public class Users {
  private String firstname;
  private String secondname;
  
public Users()
{
	super();
}
public Users(String firstname) {
	// TODO Auto-generated constructor stub
	super();
	this.firstname=firstname;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getSecondname() {
	return secondname;
}
public void setSecondname(String secondname) {
	this.secondname = secondname;
}
  
  
}
