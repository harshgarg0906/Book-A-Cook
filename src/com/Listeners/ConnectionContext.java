package com.Listeners;

	import java.sql.DriverManager;
	import java.sql.SQLException;

	import java.sql.Connection;
	import javax.servlet.ServletContextEvent;
	import javax.servlet.ServletContextListener;

//	import org.apache.tomcat.dbcp.dbcp.DriverManagerConnectionFactory;

public class ConnectionContext implements ServletContextListener {


		Connection con;
		
		public void contextInitialized(ServletContextEvent ctx) {
			
		String driver=ctx.getServletContext().getInitParameter("driver");	
		String url=ctx.getServletContext().getInitParameter("url");
		String username=ctx.getServletContext().getInitParameter("username");
		String password=ctx.getServletContext().getInitParameter("password");

		try
		{

			
			Class.forName(driver);
			con= DriverManager.getConnection(url,username,password);
			
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		 ctx.getServletContext().setAttribute("DBConnection",con);
			
	}
	    

		public void contextDestroyed(ServletContextEvent ctx) 
		{
			
			try {
			Connection con=(Connection) ctx.getServletContext().getAttribute("DBConnection");
			}
			
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
			
		}


		
		
	}

	
