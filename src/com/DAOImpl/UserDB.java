package com.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.DAOInterface.UserDBInterface;
import com.beans.Chef;
import com.beans.User;

public class UserDB implements UserDBInterface
{

	Connection con;
	PreparedStatement pstmt;
	Statement stmt;
	ResultSet rs;

	public UserDB()
	{}
	
public UserDB(Connection con)
{
	this.con=con;
	System.out.println("connection object is:"+con);
}

public boolean checkSignup1(User c)throws SQLException
{
		System.out.println("-----in daoimpl user class-checking signup----");
		pstmt=con.prepareStatement("select * from customer");
		rs=pstmt.executeQuery();
		
		if(rs!=null) 
		{
			while(rs.next())
			{
				System.out.println(c.getuName()+c.getuPassword()+"input");
			
				System.out.println(rs.getString(2)+rs.getString(3)+"db");
			
				if(c.getuName().equals(rs.getString(2)) && c.getuPassword().equals(rs.getString(3)))
				{
					return true;
		}
			}
		}
		else
		{
			System.out.println("-----------user table is empty--------");
		}
		return false;
}



public void signUp(User u)throws SQLException//signup validation
{
		pstmt=con.prepareStatement("insert into customer(name,password,contact,address) values(? ,? ,? ,?)");

		pstmt.setString(1, u.getuName());
		pstmt.setString(2, u.getuPassword());
		pstmt.setFloat(3, u.getuContact());
		pstmt.setString(4, u.getuAddress());
		
		pstmt.executeUpdate();	
		System.out.println("signed up");	
}


	public boolean signIn(User u)throws SQLException//signin validation
	{
		pstmt=con.prepareStatement("Select * from customer");
			rs=pstmt.executeQuery();
			String user,pass;
			while(rs.next())
			{
				user=rs.getString(2);
				pass=rs.getString(3);
				if(user.equals(u.getuName()) && pass.equals(u.getuPassword()))
				{
					return true;
				}
			}	
		return false;
	}	
	

	public ArrayList<String> getCooks(String type,int time,int budget)throws SQLException//to get the cook names into an arraylist for matching search queries 
	{
		ArrayList<String> a=new ArrayList<String>();
		pstmt=con.prepareStatement("Select * from chef12");
		rs=pstmt.executeQuery();
		String name,type1;
		int ma=0,ea = 0,budget1=0;
			if(rs !=null) 
			{

		while(rs.next())
		{	
			
			name=rs.getString(2);
			type1=rs.getString(5);
			ma=rs.getInt(7);
			ea=rs.getInt(8);
			budget1=rs.getInt(9);
			
			
			
			if(type1.equals(type) && budget1 <= budget) 
			{
			if(time==1 && ma==1 )
			{
					a.add(name);	
			}
			else if(time==2 && ea==1)
			{
					a.add(name);
			}
			else if(time==3 && ma==1 && ea==1)
			{
					a.add(name);
			}	}		
		}
		return a;	}
		
		return null;
		
	}
	
	public Chef getCookDetails(String cooks)throws SQLException//to fetch cook details once he is selected
	{
		Chef c=new Chef();
			pstmt=con.prepareStatement("select * from chef12");
			rs=pstmt.executeQuery();
			String name;
			System.out.println(cooks);
			if(rs!=null) {
			while(rs.next())
			{
				name=rs.getString(2);
				if(cooks.equals(name))
				{
					c.setcName(name);
					c.setcExp(rs.getInt(6));
					c.setcSalary(rs.getInt(9));
					c.setcFullname(rs.getString(10));
					c.setcContact(rs.getLong(4));
				}
			}
			System.out.println("in cood details database class"+c);
			return c; }
			
		return null;
	}

	public void setAvailability(String cook,int time)throws SQLException//to update the availability of cook
	{

		if(time==1)
		{
//			pstmt=con.prepareStatement("update chef11 set ma=0 where name=?");
//			pstmt.setString(1, cook);
//			pstmt.executeUpdate();	
		}
		else if(time==2)
		{
			pstmt=con.prepareStatement("update chef12 set ea=0 where name=?");
//			pstmt.setString(1, cook);
			pstmt.executeUpdate();	
		}
		else if(time==3)
		{
			pstmt=con.prepareStatement("update chef12 set ea=0,ma=0 where name=?");
//			pstmt.setString(1, cook);
			pstmt.executeUpdate();	
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

