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
import javax.servlet.annotation.WebFilter;

import com.beans.User;


@WebFilter("/Filter2")
public class SignupFilter implements Filter 
{

  
    public SignupFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	
	public boolean validate(String username,String password)
	{
		if(username != null && password.length()>5)
		{
			return true;
		}
		return false;
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		float Contact=Float.parseFloat(request.getParameter("uContact"));
		String Address=request.getParameter("uAddress");
		
			User u=new User("", "", Contact, Address);
			request.setAttribute("signupuser",u);
			
			chain.doFilter(request, response);
		
		    
		
	}


	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
