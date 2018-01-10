package com.pro.homepageController;

import java.io.IOException;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

import com.pro.bean.CustomerProfileBean;

@Controller
public class SubmitDetailsController {
	
	
	
	@RequestMapping(value="/GenareteRecords.html", method=RequestMethod.GET)
	public ModelAndView submitdetails()
	{
		String message="Please fill the Details";
		return new ModelAndView("GenareteRecords","Message",message);
	}
	
	@RequestMapping(value="/ConfirmRegistration.html" , method=RequestMethod.POST)
	
	public ModelAndView dosubmitdetail(@ModelAttribute("custProfile")CustomerProfileBean custProfile,BindingResult bs) throws ClassNotFoundException, IOException, SQLException
	{
		//ConnectionData cd=new ConnectionData();
		//Map<String,String> model=new HashMap<String, String>();
		
		//model.put("image", cd.list());
		
		//model.put("image", connectionBean.getImageName());
		String msg="Please Fill Up The Details";
		return new ModelAndView("ConfirmRegistration");
		
	}
	
	
	 
	

}
