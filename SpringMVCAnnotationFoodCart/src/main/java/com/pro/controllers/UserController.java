package com.pro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pro.bean.Users;
import com.pro.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
 
	@Autowired
	UserService userser;
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public ModelAndView list()
	{
		ModelAndView model= new ModelAndView("user/user_page");
		List<Users> list= userser.listallUsers();
		return model;
		
	}
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView add()
	{
		ModelAndView model= new ModelAndView("user/user_form");
		Users user=new Users();
		model.addObject("viewform",user);
		return model;
		
	}
	
	@RequestMapping(value="/update",method=RequestMethod.GET)
	public ModelAndView update(@PathVariable("firstname")String firstname)
	{
		ModelAndView model= new ModelAndView("user/user_form");
		Users user=userser.findUserByname(firstname);
		model.addObject("viewform",user);
		return model;
		
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("user")Users user)
	{
		ModelAndView model= new ModelAndView("user/user_form");
		if(user!=null && user.getFirstname()!=null)
		{
			userser.updateUser(user);
		}
		else
		{
			userser.addUsers(user);
		}
		
		return new ModelAndView("redirect/list");
		
	}
	
	 @RequestMapping(value="/delete",method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("firstname")String firstname)
	 {
	    userser.deleteUser(firstname);
		return new ModelAndView("redirect/list");
		
	 }

}
