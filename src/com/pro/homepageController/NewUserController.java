package com.pro.homepageController;
import java.beans.PropertyEditor;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pro.bean.CustProfileEditor;
import com.pro.bean.UserBean;
import com.pro.service.serviceDao;
import com.pro.session.SessionFlowController;
import com.pro.url.UrlProperties;

@Controller
public class NewUserController {

	@Autowired serviceDao dao;
	// @Autowired UserValidator uservalidator;
	/*
	 * @Autowired LoginImpl dao;
	 */

	//@Autowired SessionFlowController session;
	//@Autowired UserService userSer;
	

	@RequestMapping(value = UrlProperties.NEW_USER, method = RequestMethod.GET)
	public ModelAndView test(Model model) throws ClassNotFoundException,
			IOException, SQLException {
		
		
		String msg = "Please Enroll the Details for New User";
		
		return new ModelAndView("newUser", "Message", msg);

	}

	/*@RequestMapping(value = UrlProperties.DO_HOME, method = RequestMethod.POST)
	public ModelAndView userLogin(@Valid @ModelAttribute("userbean1") UserBean userbean1, BindingResult bs) {
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	    SessionFlowController session=new SessionFlowController();
        if (bs.hasErrors()) {
			ModelAndView model1 = new ModelAndView("Details");
			return model1;
		}
		session.setUserId(1234);
		session.setUserName(userbean1.getUserName());
		if(userbean1.getUserId()==session.getUserId() && userbean1.getUserName()==session.getUserName())
		{
		
			ModelAndView model = new ModelAndView("login");
			return model;
		}
		
		ModelAndView model= new ModelAndView("Details");
		return model;
		
		
       
	}*/

}

