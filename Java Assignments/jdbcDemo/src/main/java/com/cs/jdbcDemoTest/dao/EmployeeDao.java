package com.cs.jdbcDemoTest.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.cs.jdbcDemoTest.dto.UserProfile;

public class EmployeeDao 
{
	Connection con = null;
	PreparedStatement psinsert;
	public EmployeeDao()
	{
		con = DBConnection.getConnection();
	}
	
	public boolean employeeRegister(UserProfile empBean)
	{
		try 
		{
			psinsert = con.prepareCall("insert into USERPROFILE1 values(?,?,?,?)");
			psinsert.setString(1, empBean.getUserid());
			psinsert.setString(2, empBean.getFname());
			psinsert.setString(3, empBean.getLname());
			psinsert.setInt(4, empBean.getAge());
			
			int result = psinsert.executeUpdate();
			if(result>0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return false;
		}
	}
	PreparedStatement psSelect;
	ResultSet result;
	public List<UserProfile> displayEmpDetailsDao(int age) 
	{
		List<UserProfile> empList = new ArrayList<UserProfile>();
		try
		{
			psSelect = con.prepareStatement("select * from userprofile where age=?");
			psSelect.setInt(1, age);
			
			result = psSelect.executeQuery();
			
			while(result.next())
			{
				UserProfile userBean = new UserProfile();
				userBean.setUserid(result.getString(1));
				userBean.setFname(result.getString(2));
				userBean.setLname(result.getString(3));
				userBean.setAge(result.getInt(4));
				
				empList.add(userBean);
				
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return empList;
	}
	
}
