package com.pro.homepageController;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.pro.bean.CustomerProfileBean;
import com.pro.serviceDao.*;

@Controller
public class CustomerEnrollController {
	//@Autowired HospitalServiceDao dao;
      @RequestMapping(value="/Registration.html", method=RequestMethod.GET)
	  public ModelAndView showRegister()
	  {
    	  
		String stat="The User has Successfully Enrolled the details.";
	    return new ModelAndView("GenareteRecords","Status",stat);
		
	  }
	
	/* @RequestMapping(value="/ConfirmRegistration.html" , method=RequestMethod.POST)
	 public ModelAndView register(@ModelAttribute("profileBean") CustomerProfileBean profileBean , BindingResult result)
	 {
		// dao.registerCust(profileBean);
		ModelAndView model= new ModelAndView("ConfirmRegistration");
		return model;
	 }*/
	
}
	


