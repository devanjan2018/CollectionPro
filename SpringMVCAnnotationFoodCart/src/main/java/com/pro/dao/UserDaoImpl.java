package com.pro.dao;

import java.awt.SecondaryLoop;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.jar.Attributes.Name;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.pro.bean.Users;

@Repository
public class UserDaoImpl implements UserDao{

	NamedParameterJdbcTemplate namedJDBCtemplate;
	
	
	public List<Users> listallUsers() {
		// TODO Auto-generated method stub
		String sql="select * from test_records";
		List<Users> list=namedJDBCtemplate.query(sql, getSqlParameter(null),new UserMapper());
		return null;
	}
	
	private SqlParameterSource getSqlParameter(Users user)
	{
		MapSqlParameterSource parameterSource=new MapSqlParameterSource();
		if(user!=null)
		{
			parameterSource.addValue("firstname", user.getFirstname());
			parameterSource.addValue("secondname", user.getSecondname());
		}
		return parameterSource;
	}
	
	private static final class UserMapper implements RowMapper<Users>
	{
		public Users mapRow(ResultSet rs,int rowNum)throws SQLException
		{
			Users user=new Users();
			user.setFirstname(rs.getString("firstname"));
			user.setSecondname(rs.getString("secondname"));
			return user;
		}
	}

	public void addUsers(Users user) {
		// TODO Auto-generated method stub
		String sql="insert into test_records(firstname,secondname)values(:firstname,:secondname)";
		namedJDBCtemplate.update(sql, getSqlParameter(user));
		
	}

	public void updateUser(Users user) {
		// TODO Auto-generated method stub
		String sql="update test_records set firstname=:firstname,secondname=:secondname where firstname=:firstname";
		namedJDBCtemplate.update(sql, getSqlParameter(user));
	}

	public void deleteUser(String firstname) {
		// TODO Auto-generated method stub
		String sql="delete from test_records where firstname=:firstname";
		namedJDBCtemplate.update(sql, getSqlParameter(new Users(firstname)));
	}

	public Users findUserByname(String firstname) {
		// TODO Auto-generated method stub
		String sql="select * from test_records where firstname=:firstname";
		return namedJDBCtemplate.queryForObject(sql, getSqlParameter(new Users(firstname)),new UserMapper());
	}
	

}
