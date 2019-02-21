package com.Filters;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.beans.Chef;

public class ChefLoginFilter implements Filter
{
	public void destroy() 
	{}
	public boolean validate(String username,String password)
	{
		if(username != null && password.length()>5)
		{
			return true;
		}
		return false;
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)throws IOException, ServletException 
	{
		 PrintWriter out=response.getWriter();
		 String chefName=request.getParameter("cName");
		 String chefPassword=request.getParameter("cPassword");
		 Chef c=new Chef();
		 if(validate(chefName,chefPassword))
		 {
			 chefName=chefName.concat("@gmail.com");
			 c.setcName(chefName);
			 c.setcPassword(chefPassword);
			 request.setAttribute("signinchef",c);
			 chain.doFilter(request, response);
			 System.out.println("exit filter"); 
		  }
		  else
		  {
			  RequestDispatcher rd=request.getRequestDispatcher("/chef.jsp");
			  rd.include(request, response);
			  out.print("<p style='font-size:30px; color:red; text-align:center;'>invalid username or password!</p>");
		  }
	}
	public void init(FilterConfig arg0) throws ServletException 
	{
		// TODO Auto-generated method stub
		
	}

	

}