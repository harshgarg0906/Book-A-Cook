<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>User SignUp</title>
	<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
	<link href="bootstrap-3.3.7/dist/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
	<script src="bootstrap-3.3.7/dist/js/bootstrap.min.js"></script>
	
	<link rel="stylesheet" type="text/css" href="chef.css">
	<script type="text/javascript" src="chefReg.js"></script>
	<script type="text/javascript" src="chefConstraint.js"></script>
</head>
<body>
	
	<nav class="navbar navbar-inverse">
  		<div class="container-fluid">
    		<div class="navbar-header">
      			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        			<span class="icon-bar"></span>
        			<span class="icon-bar"></span>
        			<span class="icon-bar"></span>                        
      			</button>
      			<a class="navbar-brand" href="#"><img src="images/BAC-logo2.png" width="30px" height="30px"></a>
    		</div>
    		<div class="collapse navbar-collapse" id="myNavbar">
      			<ul class="nav navbar-nav navbar-right">
	        		<li class="active"><a href="#">Home</a></li>
	        		<li><a href="aboutUs.html">About</a></li>
        			<li><a href="contact.html">Contact</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="uLogin.jsp"><span class="glyphicon glyphicon-log-in"></span>User Login</a></li>
      </ul>
    </div>
  </div>
</nav>

	<h1 align="center" style="color:white;">SIGNUP TO HIRE A COOK!!</h1>

	<div class="container" style="margin-top: 100px;">
    	<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form id="register-form" action="log2" method="post" onsubmit="return validateReg()" role="form" style="display: block;">
									
									
									<div class="form-group">
										Contact No.
										<input required type="number"  minlength="10"  maxlength="10" name="uContact" id="contact" tabindex="1" class="form-control" placeholder="Phone no." value="">
									</div>
									
									<div class="form-group">
										Address
										<input required type="text"  minlength="4" maxlength="29" name="uAddress"  tabindex="1" class="form-control" placeholder="Your Address" value="">
									</div>
									
									
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="register-submit" id="register-submit" tabindex="3" class="form-control btn btn-register" value="Sign Up">
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