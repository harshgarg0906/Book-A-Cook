<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
<title>Search</title>
	<!-- default bootstrap styles -->
 	<link rel="stylesheet" href="bootstrap-3.3.7/dist/css/bootstrap.min.css">
    <!-- Custom styles for this template -->
    <link href="chef.css" rel="stylesheet">    
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
      			<a class="navbar-brand" href="Welcome.html"><img src="images/BAC-logo2.png" width="30px" height="30px"></a>
    		</div>

    		<div class="collapse navbar-collapse navbar-right" id="myNavbar">
      			<ul class="nav navbar-nav">
	        		<li><a href="Welcome.html">Home</a></li>
	        		<li><a href="aboutUs">About Us</a></li>
        			<li><a href="contact.html">Contact</a></li>
      			</ul>
  		    </div>
  		</div>
	</nav>
	<!-- navbar end -->
	
	<div class="container">
	<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="row">
								<a href="#" class="active" id="login-form-link">Search for Cook</a>
						</div>
						<hr>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form name ="login-form" id="login-form" action="log3" onsubmit="return validateLogin()" method="post" role="form" style="display: block;">
									<div class="form-group">
										<label for="user-name" class="col-lg-2 control-label">Preference </label>
										<div class="col-lg-10">
											<select class="form-control" name="type">
												<option value="veg">Veg</option>
												<option value="non-veg">Non-veg</option>
											</select>
										</div>
									</div>
									<div class="form-group">
										<label for="email" class="col-lg-2 control-label">Budget</label>
										<div class="col-lg-10">
											<select class="form-control" name="budget">
												<option value="1000">1000</option>
												<option value="2000">2000</option>
												<option value="3000">3000</option>
												<option value="4000">4000</option>
											</select>
										</div>
									</div>
									<div class="form-group">
										<label for="message" class="col-lg-2 control-label">Timing</label>
										<div class="col-lg-10">
											<select class="form-control" name="time">
												<option value="1">Morning</option>
												<option value="2">Evening</option>
												<option value="3">Both</option>
											</select>
										</div>
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-lg-12">
												<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="search" id="search-submit" tabindex="3" class="form-control btn btn-search" value="Search">
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
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</body>
</html>