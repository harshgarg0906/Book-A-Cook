<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.Date" %>
    
	<%!
	float amt;%>
    <%double r= Math.random()*100000;
    String d=new Date().toString();
	amt = (Float) session.getAttribute("amount");
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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

	<div class="container" style="margin-top: 5px;">
    	<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="row">
							<div class="col-sm-6">
								<h3>Payment Successful</h3>
							</div>
							<hr>
						</div>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form action="pay" method="post" role="form" style="display: block;">
									
									<div class="form-group col-lg-12">
										<label for="cook-name" class="col-lg-4 control-label">Transaction Id:</label>
										<div class="col-lg-6">
											<%=r%>
										</div>
									</div>
									
									<div class="form-group col-lg-12">
										<label for="cook-name" class="col-lg-4 control-label">Amount:</label>
										<div class="col-lg-6">
											<%=amt%>
										</div>
									</div>
									<div class="form-group col-lg-12">
										<label for="cook-name" class="col-lg-4 control-label">Status:</label>
										<div class="col-lg-6">
											<%="success"%>
										</div>
									</div>
									<div class="form-group col-lg-12">
										<label for="cook-name" class="col-lg-4 control-label">Time:</label>
										<div class="col-lg-6">
											<%=d%>
										</div>
									</div>
									
									<div class="form-group col-lg-12">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="amount-submit" class="form-control btn btn-register" value="Sign Out">
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