package com.DAOInterface;

import java.sql.SQLException;
import java.util.ArrayList;

import com.beans.Chef;
import com.beans.User;

public interface UserDBInterface
{
	public void signUp(User u)throws SQLException;
	public boolean signIn(User u)throws SQLException;
	public void setAvailability(String cooks,int time)throws SQLException;
	public Chef getCookDetails(String cooks)throws SQLException;
	public ArrayList<String> getCooks(String type,int time,int budget)throws SQLException;
	public boolean checkSignup1(User u)throws SQLException;
}
