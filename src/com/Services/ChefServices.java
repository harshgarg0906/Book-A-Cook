package com.Services;

import java.sql.Connection;
import java.sql.SQLException;

import com.DAOImpl.ChefDBImpl;
import com.DAOInterface.ChefDBInterface;
import com.Providers.Provider;
import com.ServiceInterface.ChefServiceinterface;
import com.beans.Chef;

public class ChefServices implements ChefServiceinterface
{
	protected static Connection con;
	Provider p;
	ChefDBInterface da;
	public ChefServices()
	{
		p=new Provider();
		da=new ChefDBImpl();
	}
	
	public void connect(Connection cn)
	{
		con=cn;
		da.connect(con);
	}
	public boolean checkUser(Chef c)throws SQLException
	{
		return(da.checkSignin(c));	
	}
	public boolean checkSignup(Chef c)throws SQLException
	{
		return (da.checkSignup(c));
	}

	public void addCook(Chef c)throws SQLException
	{
		
		da.addCook(c);
	}
	
	public Chef getProfile(String name)throws SQLException
	{
		Chef c=new Chef();
		System.out.println("in service class of chef get profile method"+c);
		c=da.getProfile(name);
		return c;
	}

	public int cookupdate(Chef c, String name) throws SQLException
	{
		int i=da.cookupdate(c, name);
		return i;
	}

	public Chef getNewChef(Chef c, Chef c1)
	{
		String name=c1.getcName();
		String pass=c1.getcPassword();
		c.setcName(name);
		c.setcPassword(pass);
		return c;
	}
}
