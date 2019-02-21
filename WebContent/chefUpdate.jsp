<!DOCTYPE html>
<html>
<head>
	<title>UPDATE</title>
	<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
	<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
	
	<link rel="stylesheet" type="text/css" href="chef.css">
	<script type="text/javascript" src="chef.js"></script>
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
      			<a class="navbar-brand" href="Welcome.html"><img src="images/BAC-logo2.png" width="30px" height="30px"></a>
    		</div>
    		<div class="collapse navbar-collapse navbar-right" id="myNavbar">
      			<ul class="nav navbar-nav">
	        		<li class="active"><a href="Welcome.html">Home</a></li>
	        		<li><a href="aboutUs.html">About</a></li>
        			<li><a href="contact.html">Contact</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="uLogin.jsp"><span class="glyphicon glyphicon-log-in"></span>User Login</a></li>
      </ul>
    </div>
  </div>
</nav>

	<h1 align="center" style="color:white;">UPDATE YOUR PROFILE</h1>

	<div class="container" style="margin-top: 10px;">
    	<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form id="register-form" action="update" method="post" onsubmit="return validateReg()" role="form" style="display: block;">
		
						<div class="form-group">
										Your New Full Name
										<input required type="text" minlength="1" maxlength="29" name="updatename" id="name" tabindex="1" class="form-control" placeholder="New Password"/>
									</div>
									
									<div class="form-group">
										Your New Password
										<input required type="password" minlength="8" maxlength="29" name="updatepassword" id="passoword" tabindex="1" class="form-control" placeholder="New Password"/>
									</div>
									
									<div class="form-group">
										Your New Contact Number
										<input required type="number" minlength="10" maxlength="10" name="updatecontact" id="contact" tabindex="1" class="form-control" placeholder="Phone no." value="">
									</div>
									
									<div class="form-group">
										What type of food will you cook?<P>
										<select  class="form-control" name="updatetype" required>
											<option>VEGETARIAN</option>
									 		<option>NON-VEGETARIAN</option>
 										</select>
									</div>	
									<div class="form-group">
										Your Expected Salary<P>
										<select class="form-control" name="updatesalary" required>
												<option value="1000">1000</option>
										 		<option value="2000">2000</option>
										 		<option value="3000">3000</option>
										 		<option value="4000">4000</option>
	 										</select></div>
									
									<div class="form-group">
										How many years of experience? <P>
										<input class="form-control" required type="number" min="1" max="15" name="updateexperience"/>
									</div>
									
									<div class="form-group">
										Availability:<P>
										Morning Shift:<input type="checkbox" name="morning" value="1"/> &nbsp;
										Evening Shift:<input type="checkbox" name="evening" value="1"/>
									</div>	
									
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="register-submit" id="register-submit" tabindex="3" class="form-control btn btn-register" value="Update Now">
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