package com.pro.homepageController;


import java.util.Map;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;



//import com.pro.common.CountryList;


@Controller
public class CustomerEnrollController {
	
      @RequestMapping(value="/Registration.html", method=RequestMethod.GET)
	  public ModelAndView showRegister(ModelMap model)
	  {
    	
    	  
          //take the state in the list and iterate
         // JsonElement country=gson.fromJson(Iproperty.country_list, JsonElement.class);
    	  
		//Map<String, String> country = CountryList.CountryReference;
		
		//Map<String, String> country = CountryList.CountryReference;
		//model.put("Country", country);
		String stat="The User has Successfully Enrolled the details.";
        return new ModelAndView("Registration","Status",stat);
		
	  }
	
	/* @RequestMapping(value="/ConfirmRegistration.html" , method=RequestMethod.POST)
	 public ModelAndView register(@ModelAttribute("profileBean") CustomerProfileBean profileBean , BindingResult result)
	 {
		// dao.registerCust(profileBean);
		ModelAndView model= new ModelAndView("ConfirmRegistration");
		return model;
	 }*/
	
}
	


