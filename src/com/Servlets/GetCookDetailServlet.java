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

public class GetCookDetailServlet extends HttpServlet
{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		Chef c;
		Connection con;
		Provider p;
		public void init()
		{	
			con=(Connection) getServletContext().getAttribute("DBConnection");
			p=new Provider();
			c=new Chef();
		}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
			response.setContentType("text/html");
			HttpSession session =request.getSession(false);
			String cooks=(String) request.getParameter("cook");
//store cook object from database matching the cook name
			try
			{
				c=p.getDBobj(con).getCookDetails(cooks);
				session.setAttribute("selectedcook",c);			
				RequestDispatcher rd= request.getRequestDispatcher("/CookDetails.jsp");
				rd.forward(request,response);
			} 
			catch (SQLException e)
			{
				e.printStackTrace();
			}	
}

	}
	
	
	

