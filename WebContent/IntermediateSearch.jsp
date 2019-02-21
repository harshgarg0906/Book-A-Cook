<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="java.util.ArrayList" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
   
	<title>
		Results
	</title>
     <link rel="stylesheet" href="bootstrap-3.3.7/dist/css/bootstrap.min.css">
</head>
<body>
	<jsp:include page="Search.jsp"></jsp:include>
	<%!
	String cooks=""; 
	ArrayList<String> a=new ArrayList<String>();
	%>

	<%
	a=(ArrayList<String>)session.getAttribute("list");
	%>
	
	
	<div class="container" style="margin-top: 5px;">
    	<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form action="log4" method="post" role="form" style="display: block;">
									<div class="form-group">
										<label for="user-name" class="col-lg-2 control-label">Available Cooks are:</label>
										<div class="col-lg-10">
											<select class="form-control" name="cook">
													<% 
										for(int j=0;j<a.size();j++)
										{
											cooks=(String) a.get(j);
										 %>
													<option value="<%=cooks %>"><%=cooks %></option>
													<%
										}
										%>
									</select>
										</div>
									</div>
									
									
									<div class="form-group">
										<div class="row">
											<div class="col-lg-12">
												<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="search" id="search-submit" tabindex="3" class="form-control btn btn-search" value="Submit">
												</div>
											</div>
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

	<!-- Latest compiled and minified JavaScript -->
<script src="bootstrap-3.3.7/dist/js/bootstrap.min.js" ></script>
</body>
</html>