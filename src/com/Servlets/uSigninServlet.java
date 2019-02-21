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
import com.Exceptions.InvalidUserException;
import com.Providers.Provider;
import com.beans.User;


public class uSigninServlet extends HttpServlet 
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
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		User u=(User) request.getAttribute("newuser");
		try
		{
//check signin content validation
			if (p.getDBobj(con).signIn(u))
			{
				HttpSession session =request.getSession(true);
				System.out.println("session created!"+session.getId());
				RequestDispatcher rd= request.getRequestDispatcher("/Search.jsp");
				rd.forward(request,response);
			}
			else
			{
				RequestDispatcher rd= request.getRequestDispatcher("/uLogin.jsp");
				rd.include(request,response);
				out.println("<p style='font-size:30px; color:red; text-align:center;'>Incorrect username or password</p>");
				throw new InvalidUserException("entered username or password is incorrect!");
			}
		} 
		catch (SQLException | InvalidUserException e)
		{
			e.printStackTrace();
		}
	}

}









