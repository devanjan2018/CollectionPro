package com.pro.bean;

import java.beans.PropertyEditorSupport;

public class CustProfileEditor extends PropertyEditorSupport{
	@Override
	public void setAsText(String gender) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
		if(gender!=null)
		{
		    if(gender.contains("Male"))
		   {
			   setValue("Mr");
		   }
		    if(gender.contains("Female")){
			setValue("Ms");
		    }
		}
	}
  
}
