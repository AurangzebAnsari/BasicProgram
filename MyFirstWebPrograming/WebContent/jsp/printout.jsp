<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>second page</title>
</head>
<body>
<h2>Print result</h2>
<form method="post" action="   ">
<%=session.getAttribute("name") %>
</br>
<%=session.getAttribute("add") %>
</br>
<%=session.getAttribute("phone") %>
</br>
<%=session.getAttribute("id") %>
</br>
<%=session.getAttribute("course") %>
</form>
</body>
</html>