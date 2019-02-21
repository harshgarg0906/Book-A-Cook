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

public class GetChefProfileServlet extends HttpServlet 
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
		String name=(String) session.getAttribute("cookname");
		try 
		{
			Chef c=p.getChefServiceObj().getProfile(name);
			session.setAttribute("getchefprofile", c);

			System.out.println(c+"BBB");
			RequestDispatcher rd=request.getRequestDispatcher("/cDisplayprofile.jsp");
			rd.forward(request, response);
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		 
	}

}
