package com.Servlets;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Exceptions.ZeroPeopleEnteredException;
import com.Providers.Provider;
import com.beans.Chef;



public class CalcAmtServlet extends HttpServlet 
{
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
	
		HttpSession session = request.getSession(false);
		int ppl=Integer.parseInt(request.getParameter("people"));
		Chef c=(Chef)session.getAttribute("selectedcook");
		System.out.println(c);
		int sal=c.getcSalary();
		float amt;
		try
		{
			amt = p.getServices().calculate(ppl, sal);
			System.out.println(amt+"in servlet for amount*******************");
			session.setAttribute("amount", amt);
			RequestDispatcher rd=request.getRequestDispatcher("/DisplayAmount.jsp");
			rd.forward(request, response);
		}
		catch (ZeroPeopleEnteredException e) 
		{
			e.printStackTrace();
		}
		
	}

}
