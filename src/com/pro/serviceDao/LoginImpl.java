/*package com.pro.serviceDao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.pro.bean.UserBean;
@Service
public class LoginImpl implements LoginDao {
@Autowired
DataSource datasource;

@Autowired
JdbcTemplate jdbctemp;

  public void setJdbc(JdbcTemplate jdbctemp)
  {
	  jdbctemp=this.jdbctemp;
  }
	
	@Override
	public void save(UserBean userbean) {
		String sql = "insert into login_patient values(?,?,?)";
		jdbctemp.update(sql, new Object[] { userbean.getUserId(), userbean.getUserName(), userbean.getGender()});

		String sql="insert into login_patient(userid,username,gender) values("+userbean.getUserId()+",'"+userbean.getUserName()+"','"+userbean.getGender()+"')";
		
	}
	

	
	

}
*/