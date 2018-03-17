package com.pro.dao;

import java.util.List;

import com.pro.bean.Users;

public interface UserDao {
 
	public List<Users> listallUsers();
	public void addUsers(Users user);
	public void updateUser(Users user);
	public void deleteUser(String fname);
	public Users findUserByname(String firstname);
}
