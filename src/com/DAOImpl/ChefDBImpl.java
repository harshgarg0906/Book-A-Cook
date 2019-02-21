package com.DAOImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.DAOInterface.ChefDBInterface;
import com.beans.Chef;

public class ChefDBImpl implements ChefDBInterface
{
	protected static PreparedStatement pstmt;
	protected ResultSet rs;
	protected static Connection cn=null;

	public void  connect(Connection con)
	{
		cn=con;   
	}
	
      public void addCook(Chef c)throws SQLException
      {
    	  pstmt=cn.prepareStatement("insert into chef12 (name,password,contact,ma,ea,type,salary,experience,fullname) values(?,?,?,?,?,?,?,?,?)");
    	  pstmt.setString(1,c.getcName());
    	  pstmt.setString(2,c.getcPassword());
    	  pstmt.setLong(3,c.getcContact());
		  pstmt.setInt(4,c.getcEA());
		  pstmt.setInt(5,c.getcMA());
		  pstmt.setString(6,c.getcType());
		  pstmt.setFloat(7,c.getcSalary());
		  pstmt.setInt(8,c.getcExp());
		  pstmt.setString(9,c.getcFullname());
    	  pstmt.executeQuery();
    	  
    	  
      }
     /* public void addCook2(Chef c)throws SQLException
      {
    		  pstmt=cn.prepareStatement("UPDATE chef11 SET contact=?, ma=?, ea=?, type=?, salary=?, experience=?, chefname=? where name=?");
    		  pstmt.setFloat(3,c.getcContact());
    		  pstmt.setInt(4,c.getcEA());
    		  pstmt.setInt(5,c.getcMA());
    		  pstmt.setString(6,c.getcType());
    		  pstmt.setFloat(7,c.getcSalary());
    		  pstmt.setInt(8,c.getcExp());
    		  pstmt.setString(9,c.getcFullname());
    		  pstmt.setString(8, c.getcName());
    		  pstmt.executeUpdate();
      }*/
	
	public boolean checkSignup(Chef c)throws SQLException
	{
			System.out.println("-----in daoimpl class-checking signup----");
			pstmt=cn.prepareStatement("select * from chef12");
			rs=pstmt.executeQuery();
			if(rs!=null) 
			{
				while(rs.next())
				{
					System.out.println(c.getcName()+c.getcPassword()+"input");
					
					System.out.println(rs.getString(2)+rs.getString(3)+"db");
				
					if(c.getcName().equals(rs.getString(2)) && c.getcPassword().equals(rs.getString(3)))
					{
						return true;
					}
			}
			}
			else
			{
				System.out.println("-----------cook table is empty--------");
			}
			return false;
	}

	
	public boolean checkSignin(Chef c) throws SQLException
	{
			pstmt=cn.prepareStatement("select * from chef12");
			rs=pstmt.executeQuery();
			if(rs!=null) {
			while(rs.next())
			{

				System.out.println(c.getcName()+c.getcPassword()+"input");
				
				System.out.println(rs.getString(2)+rs.getString(3)+"db");
				if(c.getcName().equals(rs.getString(2))&&c.getcPassword().equals(rs.getString(3)))
					return true;
			}
			}
		return false;
	}
	
	public int cookupdate(Chef c,String name)throws SQLException
	{
		int upcnt=0;
			System.out.println(c+"--------------------------------------------------===yewgfuiwue");
			pstmt=cn.prepareStatement("update chef12 set password=?, contact=?, ma=?, ea=?, type=?, salary=?, experience=?,fullname=? where name=?");
			pstmt.setString(1,c.getcPassword());
			pstmt.setLong(2, c.getcContact());
			pstmt.setInt(3, c.getcMA());
			pstmt.setInt(4, c.getcEA());
			pstmt.setString(5, c.getcType());
			pstmt.setFloat(6, c.getcSalary());
			pstmt.setInt(7, c.getcExp());
			pstmt.setString(8, c.getcFullname());
			pstmt.setString(9, name);
			upcnt=pstmt.executeUpdate();
			System.out.println("after update");
		return upcnt;
	}
	
	public Chef getProfile(String name1)throws SQLException
	{
		
			pstmt=cn.prepareStatement("select * from chef12 where name=?");
			pstmt.setString(1, name1);
			rs=pstmt.executeQuery();
			while(rs.next())
			{
				String name=rs.getString(2);
				String pass=rs.getString(3);
				long contact=rs.getLong(4);
				String type=rs.getString(5);
				int exp=rs.getInt(6);
				int ma=rs.getShort(7);
				int ea=rs.getInt(8);
				int sal=rs.getInt(9);
				String fname=rs.getString(10);
//				String fname="chutiyaYash";
				Chef c=new Chef(name,pass,contact,type,exp,ma,ea,sal,fname);
				return c;
			}
		return null;
	}
}
