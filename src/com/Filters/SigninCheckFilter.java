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

@WebFilter("/log1")
public class SigninCheckFilter implements Filter
{

    /**
     * Default constructor. 
     */
    public SigninCheckFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	
	public boolean validate(String username,String password)
	{
		if(username != null && password.length()>7)
			return true;
		return false;	
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String Username=request.getParameter("uName");
		String Password=request.getParameter("uPassword");
		
		if (validate(Username,Password))
		{
			Username=Username+"@gmail.com";
			User u=new User(Username,Password);
			request.setAttribute("newuser",u);
			chain.doFilter(request, response);
		}
		else
		{
			RequestDispatcher rd= request.getRequestDispatcher("/uLogin.jsp");
			rd.include(request,response);
			out.println("<p style='font-size:30px; color:red; text-align:center;'>Username cannot be empty and password must be greater than 7</p>");
			
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
