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

public class ChefSignupServlet extends HttpServlet 
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
		
		 PrintWriter out=response.getWriter();
		 Chef c=(Chef) request.getAttribute("newchef");
		 try
		 {
			if(p.getChefServiceObj().checkSignup(c))
			 {
				 RequestDispatcher rd=request.getRequestDispatcher("/chef.jsp");
				 rd.include(request,response);
				 out.println("<p style='font-size:30px; color:red; text-align:center;'>user already exists</p>");	 
			 }
			 else
			 {
				 HttpSession s=request.getSession(true);
				 s.setAttribute("rchef", c);
				// p.getChefServiceObj().addCook1(c);
				 RequestDispatcher rd=request.getRequestDispatcher("/chefReg.jsp");
				 rd.forward(request,response);
				 out.println("<p style='font-size:30px; color:green; text-align:center;'>welcome to page</p>");
			 }
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}	 	 
	}
}
