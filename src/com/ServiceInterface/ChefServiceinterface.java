package com.ServiceInterface;

import java.sql.Connection;
import java.sql.SQLException;

import com.beans.Chef;

public interface ChefServiceinterface 
{
	public boolean checkUser(Chef c)throws SQLException;
	public boolean checkSignup(Chef c)throws SQLException;
	public void addCook(Chef c)throws SQLException;
	public void connect(Connection con);
	public Chef getProfile(String name1)throws SQLException;
	public int cookupdate(Chef c, String name)throws SQLException;
	public Chef getNewChef(Chef c, Chef c1);
}
