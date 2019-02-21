package com.DAOInterface;

import java.sql.Connection;
import java.sql.SQLException;

import com.beans.Chef;

public interface ChefDBInterface 
{

	//public void addCook(Chef c) ;
	public void addCook(Chef c)throws SQLException;
	//public void addCook2(Chef c)throws SQLException;
	public boolean checkSignup(Chef c)throws SQLException ;
	public boolean checkSignin(Chef c)throws SQLException ;
	public int cookupdate(Chef c,String name)throws SQLException;
	public Chef getProfile(String name)throws SQLException;
	public void connect(Connection con);
}
