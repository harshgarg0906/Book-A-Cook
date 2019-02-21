package com.Filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/SearchCookFilter")
public class SearchCookFilter implements Filter
{

    /**
     * Default constructor. 
     */
    public SearchCookFilter() {
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
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		String type=(String) request.getParameter("type");
		int budget=Integer.parseInt(request.getParameter("budget"));
		int time= Integer.parseInt(request.getParameter("time"));
		request.setAttribute("searchtype", type);
		request.setAttribute("searchbudget",budget);
		request.setAttribute("searchtime", time);
		System.out.println("-------"+type+"------------------in filter for cook search---------"+time+"-------------");
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
