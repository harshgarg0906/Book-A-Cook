<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.beans.Chef" session="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Final Amount</title>
<link href="bootstrap-3.3.7/dist/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
</head>
<body>
	<jsp:include page="Calculate.jsp"></jsp:include>
	
	<%!Chef c;
	float amt;%>
	<%
		c = (Chef) session.getAttribute("selectedcook");
		amt = (Float) session.getAttribute("amount");
	%>
	
	<div class="container" style="margin-top: 5px;">
    	<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="row">
							<div class="col-sm-6">
								<h3>Payable Amount</h3>
							</div>
							<hr>
						</div>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form action="Payment.jsp" method="post" role="form" style="display: block;">
									
									<div class="form-group col-lg-12">
										<label for="cook-name" class="col-lg-4 control-label">Cook Hired:</label>
										<div class="col-lg-6">
											<%=c.getcFullname()%>
										</div>
									</div>
									
									<div class="form-group col-lg-12">
										<label for="cook-name" class="col-lg-4 control-label">Your Billing Amount:</label>
										<div class="col-lg-6">
											<%=amt%>
										</div>
									</div>
									
									<div class="form-group col-lg-12">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="amount-submit" class="form-control btn btn-register" value="Proceed to checkout">
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
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

	<!-- Latest compiled and minified JavaScript -->
	<script src="bootstrap-3.3.7/dist/js/bootstrap.min.js"></script>
</body>
</html>