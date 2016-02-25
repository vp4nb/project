<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<html>
<head>
<c:set var="url" value="${pageContext.request.contextPath}"/>
<style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #33cc33;
    border-radius: 5px;
	-moz-border-radius: 5px;
	-webkit-border-radius: 5px;
	margin: 2% 0;
	height: 30px;
	text-align: center;
	
}

li {
    float: left;
}

li a {
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}
</style>
</head>
<body>
	<ul>
  <li><a  href="${url}/home">Home</a></li>
  <li><a href="${url}/student-login">Student</a></li>
  <li><a href="${url}/faculty-login">Faculty</a></li>
  <li><a href="${url}/aboutus">About Us</a></li>
  <li><a href="${url}/contactus">Contact Us</a></li>
</ul>
</body>
</html>