package com.Filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import com.beans.Chef;

public class ChefRegisterFilter implements Filter
{
	public void destroy() {}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)throws IOException, ServletException 
	{
		    long number=Long.parseLong(request.getParameter("cNumber"));
			String type=request.getParameter("cType");
			int exp=Integer.parseInt(request.getParameter("cExperience"));
			int sal=Integer.parseInt(request.getParameter("cSalary"));
			String fname=request.getParameter("cFullname");
			Chef c=new Chef();
			c.setcContact(number);
			c.setcType(type);
			c.setcExp(exp);
			c.setcSalary(sal);
			c.setcFullname(fname);
			c.setcEA(1);
			c.setcMA(1);
			request.setAttribute("registerchef",c);
		    chain.doFilter(request, response);
		    
	}
	public void init(FilterConfig arg0) throws ServletException 
	{}
}

