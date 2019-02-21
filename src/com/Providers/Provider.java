package com.Providers;

import java.sql.Connection;
import com.DAOImpl.UserDB;
import com.DAOInterface.UserDBInterface;
import com.ServiceInterface.ChefServiceinterface;
import com.ServiceInterface.UserServicesInterface;
import com.Services.ChefServices;
import com.Services.UserServices;

//provider method to return database object for use by servlets
public class Provider
{
	public UserDBInterface getDBobj(Connection con)
	{
		UserDBInterface obj=new UserDB(con);
		return obj;
	}

	public UserServicesInterface getServices()
	{
		UserServicesInterface usi=new UserServices();
		return usi;
	}
	
	public ChefServiceinterface getChefServiceObj()
	{
		ChefServiceinterface csi=new ChefServices();
		return csi;
	}
}
