
<!DOCTYPE HTML>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<html>
<head>
<title>New Shop a E-Commerce Online Shopping Category Flat Bootstrap Responsive Website Template | Registered :: w3layouts</title>

</head>
<body>

<%@ include file="header.jsp" %>

<!--banner-->
		<div class="banner1">
			<div class="container">
				<h3><a href="index">Home</a> / <span>Registered</span></h3>
			</div>
		</div>
	<!--banner-->
	<div class="content">
				<!--login-->
			<div class="login">
		<div class="main-agileits">
				<div class="form-w3agile form1">
					<h3>Register</h3>
					<form:form action="registered" method="POST" commandName="userDetails" >
						<div class="key">
							<i class="fa fa-user" aria-hidden="true"></i>
							<form:errors path="username" cssStyle="color: #ff0000" />
							<form:input  type="text" value="Username" name="userName" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Username';}" required="" path="username" />
							<div class="clearfix"></div>
						</div>
						<div class="key">
							<i class="fa fa-envelope" aria-hidden="true"></i>
							<form:errors path="userEmail" cssStyle="color: #ff0000" />
							<form:input  type="text" value="UserEmail" name="UserEmail" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email';}" required="" path="userEmail" />
							<div class="clearfix"></div>
						</div>
						<div class="key">
							<i class="fa fa-lock" aria-hidden="true"></i>
							<form:errors path="password" cssStyle="color: #ff0000" />
							<form:input  type="password" value="Password" name="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}" required="" path="password"/>
							<div class="clearfix"></div>
						</div>
						
						
						<div class="key">
							<i class="fa fa-lock" aria-hidden="true"></i>
							<form:errors path="userPhone" cssStyle="color: #ff0000" />
							<form:input  type="text" value="Mobile Number" name="userMobileNo" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Confirm Password';}" required="" path="userPhone"/>
							<div class="clearfix"></div>
						</div>
						
						<input type="submit" value="Submit">
					
					</form:form>
				</div>
				
			</div>
		</div>
		
				<%@include file="footer.jsp" %>

</body>
</html>