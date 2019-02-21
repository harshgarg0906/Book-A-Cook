<!DOCTYPE html>
<html>
<head>
	<title>Cook Registration</title>
	<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
	<link href="bootstrap-3.3.7/dist/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
	<script src="bootstrap/3.3.7/dist/js/bootstrap.min.js"></script>
	
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
	        		<li class="active"><a href="Welcome.html">Home</a></li>
	        		<li><a href="aboutUs.html">About</a></li>
        			<li><a href="contact.html">Contact</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="chef.jsp"><span class="glyphicon glyphicon-log-in"></span>Chef Login</a></li>
      </ul>
    </div>
  </div>
</nav>

	<h1 align="center" style="color:white;">REGISTER TO BECOME A COOK!!</h1>

	<div class="container" style="margin-top: 10px;">
    	<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form id="register-form" action="register" method="post" onsubmit="return validateReg()" role="form" style="display: block;">
									
									<div class="form-group">
										Full Name:
										<input type="text" maxlength="20" required name="cFullname" tabindex="1" class="form-control" placeholder="Your Full Name" value="">
									</div>
									
									<div class="form-group">
										Contact Number
										<input required type="number" maxlength="10" name="cNumber" id="contact" tabindex="1" class="form-control" placeholder="Phone no." value="">
									</div>
									
									<div class="form-group">
										What type of food will you cook?<P>
										<div class="row">
											<div class="col-lg-12">
											<select class="form-control" name="cType" required>
												<option value="veg">VEGETARIAN</option>
										 		<option value="non-veg">NON-VEGETARIAN</option>
	 										</select>
	 										</div>
 										</div>
									</div>	
									<div class="form-group">
										Your Expected Salary<P>
										<select class="form-control" name="cSalary" required>
												<option value="1000">1000</option>
										 		<option value="2000">2000</option>
										 		<option value="3000">3000</option>
										 		<option value="4000">4000</option>
	 										</select>
									</div>
									
									<div class="form-group">
										How many years of experience? <P>
										<input class="form-control" type="number" min="1" max="15" name="cExperience"/>
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
</body>
</html>