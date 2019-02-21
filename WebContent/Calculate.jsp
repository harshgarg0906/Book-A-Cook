<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
import="com.beans.Chef"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Calculate Amount</title>
	<link href="bootstrap-3.3.7/dist/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
	<!-- custom style sheet -->
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
	        		<li><a href="index.html">Home</a></li>
	        		<li><a href="aboutUs.html">About</a></li>
        			<li><a href="contact.html">Contact</a></li>
      </ul>
    
    </div>
  </div>
</nav>
	
<!-- navbar end -->



<div class="container" style="margin-top: 10px;">
    	<div class="row">
    		
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="row">
							<div class="col-sm-6">
								<h3>Almost there</h3>
							</div>
							<hr>
						</div>
						</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form action="calculate" method="post" onsubmit="return validateReg()" role="form" style="display: block;">
									
									<div class="form-group">
										<label for="cook-name" class="col-lg-4 control-label">Enter no. of People:</label>
										<div class="col-lg-8">
											<input class="form-control" type="number" name="people" min="1" max="5" required>
										</div>
									</div>
									<br><br><br>
									<div class="form-group">
										<div class="row col-lg-12">
											
											<div class="col-sm-6">
												<input type="submit" name="register-submit"  class="form-control btn btn-register" value="Amount">
											</div>
											<div class="col-sm-6">
												<a class="btn btn-register form-control" href="Search.jsp">Search Again</a>
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