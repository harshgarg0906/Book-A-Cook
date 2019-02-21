package com.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Providers.Provider;
import com.beans.Chef;
import com.beans.User;

/**
 * Servlet implementation class SignUpCheckServlet
 */
@WebServlet("/SignUpCheckServlet")
public class SignUpCheckServlet extends HttpServlet {
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
		 User u=(User) request.getAttribute("newuser");

		 System.out.println(u+"in filter1");
		 try
		 {
			if(p.getDBobj(con).checkSignup1(u))
			 {
				HttpSession session =request.getSession(true);
				System.out.println("session created if vala!"+session.getId());
				
				 RequestDispatcher rd=request.getRequestDispatcher("/uLogin.jsp");
				 rd.include(request,response);
				 out.println("<p style='font-size:30px; color:red; text-align:center;'>user already exist</p>");	 
			 }
			 else
			 {
				 HttpSession session=request.getSession(true);

				 System.out.println(u+"in s1 else");
				 session.setAttribute("reg", u);
				 System.out.println("session created! else vala"+session.getId());
					
				// p.getChefServiceObj().addCook1(c);
				 RequestDispatcher rd=request.getRequestDispatcher("/uRegistration.jsp");
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
