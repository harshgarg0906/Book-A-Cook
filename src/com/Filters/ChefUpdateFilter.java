package com.Filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import com.beans.Chef;

public class ChefUpdateFilter implements Filter
{
    public ChefUpdateFilter() 
    {}
	public void destroy() 
	{}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		String cFname=request.getParameter("updatename");
		String cPassword=request.getParameter("updatepassword");
		long cContact=Long.parseLong(request.getParameter("updatecontact"));
		String cType=request.getParameter("updatetype");
		int cSalary=Integer.parseInt(request.getParameter("updatesalary"));
		int cExp=Integer.parseInt(request.getParameter("updateexperience"));
		int cMa,cEa;
		if(request.getParameter("morning")!=null)
		{
			 cMa=Integer.parseInt(request.getParameter("morning"));
		}
		else
			cMa=0;
		if(request.getParameter("evening")!=null)
			cEa=Integer.parseInt(request.getParameter("evening"));
		else
			cEa=0;
		Chef c=new Chef("",cPassword,cContact,cType,cExp,cMa,cEa,cSalary,cFname);
		request.setAttribute("updatechef",c);
		chain.doFilter(request, response);
	}
	public void init() throws ServletException {}
	@Override
	public void init(FilterConfig arg0) throws ServletException {}
}
