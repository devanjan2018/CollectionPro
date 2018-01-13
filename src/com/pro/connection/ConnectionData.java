package com.pro.connection;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pro.bean.ConnectionBean;
import com.sun.istack.internal.logging.Logger;
public class ConnectionData {
	
	@Autowired ConnectionBean connectionBean;
	/*@ public String list() throws IOException, SQLException, ClassNotFoundException
	{
		Connection connection=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		String  connBean=null;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection= DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "devanjan",
					"systemadmin");
			 pst= connection.prepareStatement("select * from login");
			 rs = pst.executeQuery();
			 
			 while(rs.next())
			 {
				 connectionBean.setImageId(rs.getInt(1));
				  connectionBean.setImageName(rs.getString(2));
				
			 }
			
		}
		
		finally
		{
		  	if(rs!=null) //result state
		  	try
		  	{
		  		rs.close();
		  	}catch(Exception e)
		  	{}
		  	
		  	if(pst!=null)
		  	try{
		  		pst.close();
		  	   }
		  	catch(Exception e)
		  	{}
		  	
		  	if(connection!=null)
		  		try
		  	    {
		  			connection.close();
		  	    }
		  	    catch(Exception e)
		  	    {}
		  	
		  }// end of finally block
		
		
		return connBean;
	}
}


	public void getConn()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "devanjan",
					"systemadmin");
			PreparedStatement pst= con.prepareStatement("select * from login");
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				connectionBean.setImageId(rs.getInt(1));
				connectionBean.setImageName(rs.getString(2));
			}
			
			
			
		}
		
		catch(Exception e)
		{
			e.getMessage();
		}
		
		
*/
	
}