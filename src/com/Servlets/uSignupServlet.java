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

		@WebServlet("/uSignupServlet")
		public class uSignupServlet extends HttpServlet
		{
			private static final long serialVersionUID = 1L;
				Connection con;
				Provider p;

				public void init()
				{
					con=(Connection) getServletContext().getAttribute("DBConnection");
					p=new Provider();
				}
				
				protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
					HttpSession session=request.getSession(false);
					User c1=(User)session.getAttribute("reg");
					String name=c1.getuName();
					String pass=c1.getuPassword();
					
					PrintWriter out=response.getWriter();
					response.setContentType("text/html");
					User u= (User) request.getAttribute("signupuser");
					u.setuName(name);
					u.setuPassword(pass);
					try
					{
						p.getDBobj(con).signUp(u);
					}
					catch (SQLException e)
					{
						e.printStackTrace();
					}
					RequestDispatcher rd= request.getRequestDispatcher("/uLogin.jsp");
					rd.include(request,response);
					out.println("<p style='font-size:30px; color:green; text-align:center;'>You're successfully signed up<br>Sign In now</p>");
				}

			}
