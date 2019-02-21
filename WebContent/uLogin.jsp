<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
   

    <title>Chef</title>
    <link rel="stylesheet" href="bootstrap-3.3.7/dist/css/bootstrap.min.css">
    <!-- custom style sheet -->
	<link rel="stylesheet" type="text/css" href="chef.css">
	
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
      			<a class="navbar-brand" href="#"><img src="images/BAC-logo2.png" width="40px" height="40px"></a>
    		</div>
    		<div class="collapse navbar-collapse navbar-right" id="myNavbar">
      			<ul class="nav navbar-nav">
	        		<li class="active"><a href="Welcome.html">Home</a></li>
	        		<li><a href="aboutUs.html">About</a></li>
        			<li><a href="contact.html">Contact</a></li>
      			</ul>
      			<ul class="nav navbar-nav navbar-right">
       				 <li><a href="chef.jsp"><span class="glyphicon glyphicon-log-in"></span> Chef Login</a></li>
     		    </ul>
    		</div>
  		</div>
	</nav>

	<h1 align="center" style="color:white;">USER LOGIN OR REGISTER</h1>

	<div class="container" style="margin-top: 100px;">
    	<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="row">
							<div class="col-xs-6">
								<a href="#" class="active" id="login-form-link">Login</a>
							</div>
							<div class="col-xs-6">
								<a href="uRegistration.jsp" id="register-form-link">Register</a>
							</div>
						</div>
						<hr>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form name ="login-form" id="login-form" action="log1" onsubmit="return validateLogin()" method="post" role="form" style="display: block;">
									<div class="form-group">
										<input required type="text" maxlength="20" name="uName" id="username" tabindex="1" class="form-control" placeholder="Username" value=""> 
										<span id="uNameError"></span>
									</div>
									<div class="form-group">
										<input required type="password" minlength="8" maxlength="29" name="uPassword" id="password" tabindex="2" class="form-control" placeholder="Password" value="">
										<span id="uPassError"></span>
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="login-submit" id="login-submit" tabindex="3" class="form-control btn btn-login" value="Log In">
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-lg-12">
												<div class="text-center">
													<!-- <a href="" tabindex="5" class="forgot-password">Forgot Password?</a> -->
												</div>
											</div>
										</div>
									</div>
								</form>
								<form id="register-form" action="uSignUp" method="post" onsubmit="return validateAccSignUp()" role="form" style="display: none;">
									<div class="form-group">
										<input required  type="text"  maxlength="20" name="uName" id="username" tabindex="1" class="form-control" placeholder="Username" value="">
									</div>
									<div class="form-group">
										<input required type="password"  minlength="8" maxlength="29" name="uPassword" id="password" tabindex="2" class="form-control" placeholder="Password">
									</div>		
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="register-submit" id="register-submit" tabindex="3" class="form-control btn btn-register" value="Register Now">
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
<script src="bootstrap-3.3.7/dist/js/bootstrap.min.js"></script>
	<!-- custom js -->
	<script type="text/javascript" src="chef.js"></script>
	<script type="text/javascript" src="chefConstraint.js"></script>
</body>
</html>