package com.Filters;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.beans.Chef;


public class ChefSignupFilter implements Filter
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
		 String userName=request.getParameter("cName");
		 String password=request.getParameter("cPassword");
		 if(validate(userName,password))
		 {
			 userName= userName.concat("@gmail.com");
			 Chef c=new Chef(userName,password,0,"",0,1,1,0,"");
			 request.setAttribute("newchef",c);
			 chain.doFilter(request, response);
		 }
	}
	public void init(FilterConfig arg0) throws ServletException 
	{}
}
