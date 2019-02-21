package com.Filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import com.beans.Chef;
import com.beans.User;

/**
 * Servlet Filter implementation class SignUpCheck
 */
@WebFilter("/SignUpCheck")
public class SignUpCheck implements Filter {

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
		 String userName=request.getParameter("uName");
		 String password=request.getParameter("uPassword");
		 if(validate(userName,password))
		 {
			 userName= userName.concat("@gmail.com");
			 User u=new User(userName,password,0,"");
			 System.out.println(u+"in filter1");
			 request.setAttribute("newuser",u);
			 chain.doFilter(request, response);
		 }
	}
	public void init(FilterConfig arg0) throws ServletException 
	{}

}
