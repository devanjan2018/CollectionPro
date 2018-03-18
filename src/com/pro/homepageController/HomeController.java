package com.pro.homepageController;

import java.beans.PropertyEditor;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.pro.serviceDao.*;

import com.pro.Iproperty.IProperty;

import javax.validation.Valid;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sun.nio.cs.ext.ISCII91;

import com.pro.service.UserService;
import com.pro.serviceDao.UserDao;
import com.pro.session.SessionFlowController;
import com.pro.url.UrlProperties;
//import com.pro.validator.UserValidator;

import com.pro.bean.ConnectionBean;
import com.pro.bean.CustProfileEditor;
import com.pro.bean.UserBean;
import com.pro.common.Iproperty;

//import com.pro.validator.UserValidator;

@Controller
public class HomeController {

	// @Autowired UserValidator uservalidator;
	/*
	 * @Autowired LoginImpl dao;
	 */

	//@Autowired SessionFlowController session;
	@Autowired UserService userSer;
	@InitBinder
	public void initbinder(WebDataBinder binder) {
		binder.registerCustomEditor(String.class, "gender",
				(PropertyEditor) new CustProfileEditor());

	}

	@RequestMapping(value = UrlProperties.HOME, method = RequestMethod.GET)
	public ModelAndView test(Model model) throws ClassNotFoundException,
			IOException, SQLException {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date= new Date();
		model.addAttribute("date",date);
		// ConnectionData cd=new ConnectionData();
		// Map<String,String> model=new HashMap<String, String>();

		// model.put("image", cd.list());
		// model.put("image", connectionBean.getImageName());
		String msg = "Enter The UserId and UserName";
		/*
		 * String dateSystem = dateFormat.format(date);
		 * model.addAttribute("date", dateSystem);
		 */
		return new ModelAndView("Details", "Message", msg);

	}

	@RequestMapping(value = UrlProperties.DO_HOME, method = RequestMethod.POST)
	public ModelAndView userLogin(@Valid @ModelAttribute("userbean1") UserBean userbean1, BindingResult bs) {
		// dao.save(userbean1);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		UserDaoImpl userdao = (UserDaoImpl)context.getBean("HospitalMang");
		
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
			userSer.addUsers(userbean1);
			return model;
		}
		
		ModelAndView model= new ModelAndView("Details");
		return model;
		
		
       
	}

}
