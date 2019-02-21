package com.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.Exceptions.NoCooksAvailableException;
import com.Providers.Provider;


public class SearchCookServlet extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<String> a;
	String cooks;
	Connection con;
	Provider p;
	public void init()
	{
		a=new ArrayList<String>();
		con=(Connection) getServletContext().getAttribute("DBConnection");
		p=new Provider();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		HttpSession session =request.getSession(false);
		String sessionId=session.getId();
		System.out.println("Session id is "+sessionId);
		
		String type=(String) request.getAttribute("searchtype");
		int budget= (int) request.getAttribute("searchbudget");
		int time= (int) request.getAttribute("searchtime");
		session.setAttribute("time",time);
		try
		{
//get the list of available cooks fromdatabasr using the provider object of service class 
			a=p.getDBobj(con).getCooks(type, time, budget);
			System.out.println(a+"arraylist from db class");
			ArrayList<String> b=p.getServices().getAvailableCooks(a);
			System.out.println(b);
		
		if(b.isEmpty())
		{		
			RequestDispatcher rd= request.getRequestDispatcher("/Search.jsp");
			rd.include(request,response);
			out.println("<p style='font-size:30px; color:red; text-align:center;'>Sorry no cooks available with your preferences at the moment</p>");
			//throw new NoCooksAvailableException("no cooks available as per search criteria!");
			
		}
		else
		{
			session.setAttribute("list",b);	
			RequestDispatcher rd= request.getRequestDispatcher("/IntermediateSearch.jsp");
			rd.forward(request,response);					
		}
		} 
		catch (NoCooksAvailableException e)
		{
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			
			e.printStackTrace();
		}
}}

	
