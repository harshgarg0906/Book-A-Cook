<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script type="text/javascript" src="Payment.js"></script>

	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
	<title>Payment</title>
	<link rel="stylesheet" href="bootstrap-3.3.7/dist/css/bootstrap.min.css">
	<!-- custom style sheet -->
	<link rel="stylesheet" type="text/css" href="chef.css">

</head>
<body>

	<div class="container" style="margin-top: 100px;">
    	<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="row">
							<div class="col-sm-6">
								<h3>Enter your card Details</h3>
							</div>
						</div>
						<hr>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form name ="login-form" id="login-form" action="UserSignout.jsp"  method="post" role="form" style="display: block;">
									<div class="form-group">
										<input required type="number"  name="cardNo" tabindex="1" class="form-control" placeholder="Card no." id="cardno"> 
									</div>
									
									<div class="form-group">
										<input required type="text" name="cardName" id="a" tabindex="2" class="form-control" placeholder="Name on Card" >				
									</div>
									
									<div class="form-group">
										<input required type="number" min="100" max="999" name="cvv" tabindex="2" class="form-control" placeholder="CVV*" id="cvv">				
									</div>
									<p align="right">* the 3-digit number at the back of your card</p>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="login-submit" tabindex="3" class="form-control btn btn-register" value="PAY" onclick="cardname()">
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