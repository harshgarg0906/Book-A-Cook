package com.Servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.Providers.Provider;
import com.beans.Chef;

public class ChefUpdateServlet extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Connection con;
	Provider p;
	
	public void init()
	{
		con=(Connection) getServletContext().getAttribute("DBConnection");
		p=new Provider();
		p.getChefServiceObj().connect(con);		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession session=request.getSession(false);
		int i=0;
		Chef c=(Chef) request.getAttribute("updatechef");
		System.out.println(c);
		String name=(String) session.getAttribute("cookname");
		try 
		{
			i=p.getChefServiceObj().cookupdate(c,name);
			if(i>0)
			{
				System.out.println("-----------updated profile!-----------------");
				RequestDispatcher rd=request.getRequestDispatcher("/backafterupdate");
				rd.forward(request, response);
			}
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
