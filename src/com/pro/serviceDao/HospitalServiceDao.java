/*package com.pro.serviceDao;

import javax.annotation.sql.DataSourceDefinition;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.SessionFactoryUtils;

import com.pro.bean.CustomerProfileBean;

public class HospitalServiceDao implements HospitalDao{

	
	@Autowired
	DataSource datasource;
	
	  @Autowired
	  JdbcTemplate jdbcTemplate;
	  
	  
	  
	@Override
	public int registerCust(CustomerProfileBean custprofile) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	@Autowired CustomerProfileBean profilebean;
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template)
	{
		this.template=template;
	}
	
	public Object create(CustomerProfileBean temp)
	{
		String sql= "insert into records value("+temp.getCustId()+",'"+temp.getDOB()+"','"+temp.getSex()+"','"+temp.getMaritalStatus()+"')";
		
		return template.update(sql);
	}

	@Override
	public int registerCust(CustomerProfileBean custprofile) {
          String sql= "insert into records value("+custprofile.getCustId()+",'"+custprofile.getDOB()+"','"+custprofile.getAddress()+"','"+custprofile.getMaritalStatus()+"')";
		
          return template.update(sql);
		//return template.update(sql);
	}
	

	
	
	
	
}
*/