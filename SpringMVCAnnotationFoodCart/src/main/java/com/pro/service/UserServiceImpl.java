package com.pro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.bean.Users;
import com.pro.dao.UserDao;

@Service
public class UserServiceImpl implements UserService{

	UserDao userdao;
	
	@Autowired
	
	public void setUserDao(UserDao userdao)
	{
		this.userdao=userdao;
	}
	
	public List<Users> listallUsers() {
		// TODO Auto-generated method stub
		return userdao.listallUsers();
	}

	public void addUsers(Users user) {
		// TODO Auto-generated method stub
		userdao.addUsers(user);
	}

	public void updateUser(Users user) {
		// TODO Auto-generated method stub
		userdao.updateUser(user);
	}

	public void deleteUser(String firstname) {
		// TODO Auto-generated method stub
		userdao.deleteUser(firstname);
	}

	public Users findUserByname(String firstname) {
		// TODO Auto-generated method stub
		return userdao.findUserByname(firstname);
	}

}
