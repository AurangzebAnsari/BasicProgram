
<!DOCTYPE HTML>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<html>
<head>
<title>New Shop a E-Commerce Online Shopping Category Flat Bootstrap Responsive Website Template | Login :: w3layouts</title>
<!--css-->
<link href="resources/css/bootstrap.css" rel="stylesheet" type="text/css" media="all"/>
<link href="resources/css/style.css" rel="stylesheet" type="text/css" media="all" />
<link href="resources/css/font-awesome.css" rel="stylesheet">
<!--css-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="New Shop Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />

<script type="resources/application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<script src="resources/js/jquery.min.js"></script>
<link href='//fonts.googleapis.com/css?family=Cagliostro' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,800italic,800,700italic,700,600italic,600,400italic,300italic,300' rel='stylesheet' type='text/css'>
<!--search jQuery-->
	<script src="resources/js/main.js"></script>
<!--search jQuery-->

 <!--mycart-->
<script type="text/javascript" src="resources/js/bootstrap-3.1.1.min.js"></script>
 <!-- cart -->
<script src="resources/js/simpleCart.min.js"></script>
<!-- cart -->
</head>
<body>
	<%@include file="header.jsp" %>
		<!--banner-->
		<div class="banner1">
			<div class="container">
				<h3><a href="">Home</a> / <span>Login</span></h3>
			</div>
		</div>
	<!--banner-->

	<!--content-->
		<div class="content">
				<!--login-->
			<div class="login">
				<div class="main-agileits">
					<div class="form-w3agile">
						<h3>Login To New Shop</h3>
						
						
						<form name="login" action="<c:url value='/j_spring_security_check'/>" method="post">
						
						<c:if test="${not empty error }">
						   <div class="error" style="color: #ff0000";>${error}</div>
						</c:if>
						
						<div class="span9 center">
								<c:if test="${not empty msg}">
									<div class="msg">${msg} </div>
								</c:if>
							</div>
						
							<div class="key">
								<i class="fa fa-envelope" aria-hidden="true"></i>
								<input  type="text" value="userEmail" name="userEmail" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email';}" required="">
								<div class="clearfix"></div>
							</div>
							<div class="key">
								<i class="fa fa-lock" aria-hidden="true"></i>
								<input  type="password" value="password" name="password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}" required="">
								<div class="clearfix"></div>
							</div>
							<input type="submit" value="Login">
							
							<input type="hidden" name="${_csrf.parameterName}"
									value="${_csrf.token}" />
						</form>
					</div>
					<div class="forg">
						<a href="#" class="forg-left">Forgot Password</a>
						<a href="registered" class="forg-right">Register</a>
					<div class="clearfix"></div>
					</div>
				</div>
			</div>
				<!--login-->
		</div>
		
		
		<!--content-->
		<!---footer--->
           <%@ include file="footer.jsp" %>
</body>
</html>