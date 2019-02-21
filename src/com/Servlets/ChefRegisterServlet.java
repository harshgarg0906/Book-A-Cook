package com.Servlets;
import java.io.IOException;
import java.io.PrintWriter;
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

public class ChefRegisterServlet extends HttpServlet 
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
		HttpSession s=request.getSession(false);
		
		PrintWriter out=response.getWriter();
		Chef c=(Chef) request.getAttribute("registerchef");
		Chef c1=(Chef)s.getAttribute("rchef");
		Chef newchef=p.getChefServiceObj().getNewChef(c,c1);
		try 
		{
			p.getChefServiceObj().addCook(newchef);
			RequestDispatcher rd= request.getRequestDispatcher("/chef.jsp");
			rd.include(request,response);
			out.println("<p style='font-size:30px; color:green; text-align:center;'>you're successfully signed up<br>Sign In now</p>");
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}
}
