package com.pro.service;

import java.util.List;

import com.pro.bean.Users;

public interface UserService {

	public List<Users> listallUsers();
	public void addUsers(Users user);
	public void updateUser(Users user);
	public void deleteUser(String firstname);
	public Users findUserByname(String firstname);
}
