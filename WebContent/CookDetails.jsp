
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
import="com.beans.Chef"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cook Details</title>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
	<link href="bootstrap-3.3.7/dist/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
	<script src="bootstrap/3.3.7/dist/js/bootstrap.min.js"></script>
	
	<link rel="stylesheet" type="text/css" href="chef.css">
</head>
<body>

<!-- navbar start -->
	<nav class="navbar navbar-inverse">
  		<div class="container-fluid">
    		<div class="navbar-header">
      			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        			<span class="icon-bar"></span>
        			<span class="icon-bar"></span>
        			<span class="icon-bar"></span>                        
      			</button>
      			<a class="navbar-brand" href="Welcome.html"><img src="images/BAC-logo2.png" width="30px" height="30px"></a>
    		</div>
    		<div class="collapse navbar-collapse" id="myNavbar">
      			<ul class="nav navbar-nav navbar-right">
	        		<li class="active"><a href="#">Home</a></li>
	        		<li><a href="aboutUs.html">About</a></li>
        			<li><a href="contact.html">Contact</a></li>
      </ul>
     
    </div>
  </div>
</nav>
	
<!-- navbar end -->



<%!String cName="";
int cExp=0,cSalary=0;
long contact=0;
Chef c;
%>
<%
c=new Chef();
c=(Chef)session.getAttribute("selectedcook");
contact=(long)c.getcContact();
%>


<div class="container" style="margin-top: 100px;">
    	<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form id="register-form" action="log5" method="post" onsubmit="return validateReg()" role="form" style="display: block;">
									
									<div class="form-group col-lg-12">
									
										<label for="cook-name" class="col-lg-4 control-label">Cook Name:</label>
										<div class="col-lg-8">
											<%=c.getcFullname() %>
										</div>
									
									</div>
									<div class="form-group col-lg-12">
									
										<label for="cook-exp" class="col-lg-4 control-label">Experience:</label>
										<div class="col-lg-8">
											<%=c.getcExp() %>
										</div>
									</div>
									
									<div class="form-group col-lg-12">
										<label for="cook-salary" class="col-lg-4 control-label">Salary Expectations:</label>
										<div class="col-lg-8">
											<%=c.getcSalary() %>
										</div>
									</div>
									
									<div class="form-group col-lg-12">
										<label for="cook-salary" class="col-lg-4 control-label">Phone number:</label>
										<div class="col-lg-8">
											<%=contact %>
										</div>
									</div>
									<div class="form-group col-lg-12">
										<div class="row">
											<div class="col-sm-6">
												<input type="submit" name="register-submit"  class="form-control btn btn-register" value="Confirm">
											</div>
											<div class="col-sm-6">
												<a class="form-control btn btn-register" href="Search.jsp">Search Again</a>
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

</body>
</html>