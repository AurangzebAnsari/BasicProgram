<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Shop a E-Commerce Online Shopping Category Flat Bootstrap Responsive Website Template | Home :: w3layouts</title>
<!--css-->
<link href="<c:url value="resources/css/bootstrap.css"/>" rel="stylesheet" type="text/css" media="all"/>
<link href="<c:url value="resources/css/style.css"/>" rel="stylesheet" type="text/css" media="all" />
<link href="<c:url value="resources/css/font-awesome.css"/>" rel="stylesheet">
<!--css-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="New Shop Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />

<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<script src="<c:url value="resources/js/jquery.min.js"/>"></script>
<link href='//fonts.googleapis.com/css?family=Cagliostro' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,800italic,800,700italic,700,600italic,600,400italic,300italic,300' rel='stylesheet' type='text/css'>
<!--search jQuery-->
	<script src="<c:url value="resources/js/main.js"/>"></script>
<!--search jQuery-->
<script src="<c:url value="resources/js/responsiveslides.min.js"/>"></script>
 <script>
    $(function () {
      $("#slider").responsiveSlides({
      	auto: true,
      	nav: true,
      	speed: 500,
        namespace: "callbacks",
        pager: true,
      });
    });
 </script>
 <!--mycart-->
<script type="text/javascript" src="<c:url value="resources/js/bootstrap-3.1.1.min.js"/>"></script>
 <!-- cart -->
<script src="<c:url value="resources/js/simpleCart.min.js"/>"></script>
<!-- cart -->
  <!--start-rate-->
<script src="<c:url value="resources/js/jstarbox.js"/>"></script>
	<link rel="stylesheet" href="<c:url value="resources/css/jstarbox.css"/>" type="text/css" media="screen" charset="utf-8" />
		<script type="text/javascript">
			jQuery(function() {
			jQuery('.starbox').each(function() {
				var starbox = jQuery(this);
					starbox.starbox({
					average: starbox.attr('data-start-value'),
					changeable: starbox.hasClass('unchangeable') ? false : starbox.hasClass('clickonce') ? 'once' : true,
					ghosting: starbox.hasClass('ghosting'),
					autoUpdateAverage: starbox.hasClass('autoupdate'),
					buttons: starbox.hasClass('smooth') ? false : starbox.attr('data-button-count') || 5,
					stars: starbox.attr('data-star-count') || 5
					}).bind('starbox-value-changed', function(event, value) {
					if(starbox.hasClass('random')) {
					var val = Math.random();
					starbox.next().text(' '+val);
					return val;
					} 
				})
			});
		});
		</script>
<!--//End-rate-->


</head>
<body>
	<!--header-->
		<div class="header">
			<div class="header-top">
				<div class="container">
					 <div class="top-left">
						<a href="#"> Help  <i class="glyphicon glyphicon-phone" aria-hidden="true"></i> +919590414494</a>
					</div>
					<div class="top-right">
					<ul>
					
					
						<!--<li><a href="checkout.html">Checkout</a></li> --->
						
					
						
						<li><a href="<c:url value="/loginPage"/>">Login</a></li>
						
						
						<c:choose>
							<c:when test="${pageContext.request.userPrincipal.name != null}">							
							
								<i class="fa fa-user-admin"></i>
								<a>Hello, ${pageContext.request.userPrincipal.name}</a>
								<a href="<c:url value="/j_spring_security_logout"/>">
								<i class="fa fa-logout"></i>Logout</a>
							</c:when>						
							<c:otherwise>
						 </c:otherwise>
						</c:choose> 
						
						 <c:choose>
												<c:when test="${pageContext.request.userPrincipal.name != null}">
													<c:if test="${pageContext.request.userPrincipal.name == 'Admin'}">
													<li><a href="<c:url value='/categories'/>">Category</a></li>
														<li><a href="<c:url value="/suppliers"/>">Supplier</a></li>
														<li><a href="<c:url value="/products"/>">Product</a></li>
														
														
													</c:if>
														<c:if test="${pageContext.request.userPrincipal.name != 'Admin'}">
													
														<li><a href="<c:url value="/user/cart"/>">Cart</a></li>
													
													</c:if>
													</c:when>
											
													<c:otherwise>
											
														
													
													</c:otherwise>
											</c:choose>
													
						
						
						<li><a href="registered"> Create Account </a></li>
						
						
						
						
								
					</ul>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
			<div class="heder-bottom">
				<div class="container">
					<div class="logo-nav">
						<div class="logo-nav-left">
							<h1><a href="">New Shop <span>Shop anywhere</span></a></h1>
						</div>
						<div class="logo-nav-left1">
							<nav class="navbar navbar-default">
							<!-- Brand and toggle get grouped for better mobile display -->
							<div class="navbar-header nav_2">
								<button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse" data-target="#bs-megadropdown-tabs">
									<span class="sr-only">Toggle navigation</span>
									<span class="icon-bar"></span>
									<span class="icon-bar"></span>
									<span class="icon-bar"></span>
								</button>
							</div> 
							<div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
								<ul class="nav navbar-nav">
									<li class="active"><a href="" class="act">Home</a></li>	
									<!-- Mega Menu -->
									<li class="dropdown">
										<a href="#" class="dropdown-toggle" data-toggle="dropdown">Women<b class="caret"></b></a>
										<ul class="dropdown-menu multi-column columns-3">
											<div class="row">
												<div class="col-sm-3  multi-gd-img">
													<ul class="multi-column-dropdown">
														<h6>Submenu1</h6>
														<li><a href="products">Clothing</a></li>
														<li><a href="products">Wallets</a></li>
														<li><a href="products">Shoes</a></li>
														<li><a href="products">Watches</a></li>
														<li><a href="products"> Underwear </a></li>
														<li><a href="products">Accessories</a></li>
													</ul>
												</div>
												<div class="col-sm-3  multi-gd-img">
													<ul class="multi-column-dropdown">
														<h6>Submenu2</h6>
														<li><a href="products">Sunglasses</a></li>
														<li><a href="products">Wallets,Bags</a></li>
														<li><a href="products">Footwear</a></li>
														<li><a href="products">Watches</a></li>
														<li><a href="products">Accessories</a></li>
														<li><a href="products">Jewellery</a></li>
													</ul>
												</div>
												<div class="col-sm-3  multi-gd-img">
														<a href="products"><img src="<c:url value="resources/images/woo.jpg"/>" alt=" "/></a>
												</div> 
												<div class="col-sm-3  multi-gd-img">
														<a href="products"><img src="<c:url value="resources/images/woo1.jpg"/>" alt=" "/></a>
												</div>
												<div class="clearfix"></div>
											</div>
										</ul>
									</li>
									<li class="dropdown">
										<a href="#" class="dropdown-toggle" data-toggle="dropdown">Men <b class="caret"></b></a>
										<ul class="dropdown-menu multi-column columns-3">
											<div class="row">
												<div class="col-sm-3  multi-gd-img">
													<ul class="multi-column-dropdown">
														<h6>Submenu1</h6>
														<li><a href="products">Clothing</a></li>
														<li><a href="products">Wallets</a></li>
														<li><a href="products">Shoes</a></li>
														<li><a href="products">Watches</a></li>
														<li><a href="products"> Underwear </a></li>
														<li><a href="products">Accessories</a></li>
													</ul>
												</div>
												<div class="col-sm-3  multi-gd-img">
													<ul class="multi-column-dropdown">
														<h6>Submenu2</h6>
														<li><a href="products">Sunglasses</a></li>
														<li><a href="products">Wallets,Bags</a></li>
														<li><a href="products">Footwear</a></li>
														<li><a href="products">Watches</a></li>
														<li><a href="products">Accessories</a></li>
														<li><a href="products">Jewellery</a></li>
													</ul>
												</div>
												<div class="col-sm-3  multi-gd-img">
														<a href="products1"><img src="<c:url value="resources/images/woo3.jpg"/>" alt=" "/></a>
												</div> 
												<div class="col-sm-3  multi-gd-img">
														<a href="products1"><img src="<c:url value="resources/images/woo4.jpg"/>" alt=" "/></a>
												</div>
												<div class="clearfix"></div>
											</div>
										</ul>
									</li>
									
							
									<!--  <li><a href="codes.html">Short Codes</a></li>   -->
									<!-- <li><a href="mail.html">Mail Us</a></li>-->
									
									
									
									
								</ul>
							</div>
							</nav>
						</div>
						
						
						
							
							
							
						
			</div>
		</div>
		<!--header-->
		
							

</body>
</html>