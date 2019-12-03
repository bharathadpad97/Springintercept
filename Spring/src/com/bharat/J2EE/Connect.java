package com.bharat.J2EE;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bharat5.amity.Index;
import java.util.Scanner;

import javax.sql.DataSource;

public class Connect
{
	Scanner scn= new Scanner(System.in);
	@Autowired
	private MessageSource messagesource;
	private String userid;
	private String passwd;
	
	public MessageSource getMessagesource() {
		return messagesource;
	}

	public void setMessagesource(MessageSource messagesource) {
		this.messagesource = messagesource;
	}

	public void method() {
		userid=this.messagesource.getMessage("jdbcusername",null,"default msg",null);
	    passwd=this.messagesource.getMessage("jdbcpassword",null,"default msg",null);
	}

//	JdbcTemplate jdbcTemplate = null;
//	public void setDataSource(DataSource dataSource) {  //dataSource,, ref="bean of dataSource"
//		jdbcTemplate = new JdbcTemplate(dataSource);
//	}
	public  void execute() 
	{


		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",userid,passwd);
			
			Statement stmt = con.createStatement();
			
			System.out.println("Write the Query to execute");
			
			String query=scn.nextLine();
			
			  ResultSet rs = stmt.executeQuery(query); 
			  while(rs.next()) 
			  {
			  System.out.println(rs.getString("NAME")+" "+rs.getString("ID"));
			  
			  }
			 
			/*
			 * int args=stmt.executeUpdate(query);
			 * 
			 * if(args>0) { System.out.println("data succesfully inserted"); } else {
			 * System.out.println("data insertion fail"); }
			 */
			stmt.close();
			con.close();

		}
		catch(Exception e)
		{
			System.out.println(e);
		}  

	}



}



