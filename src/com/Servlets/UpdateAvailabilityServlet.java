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


public class UpdateAvailabilityServlet extends HttpServlet {

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
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

		HttpSession session =request.getSession(false);
		Chef c=(Chef)session.getAttribute("selectedcook");
		int t=(int)session.getAttribute("time");
		String cook=c.getcName();
//calling function through object of provider class to update the availability of cook if he is selected and confirmed by the user
		try
		{
			p.getDBobj(con).setAvailability(cook, t);
			RequestDispatcher rd= request.getRequestDispatcher("/Calculate.jsp");
			rd.forward(request,response);
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}
