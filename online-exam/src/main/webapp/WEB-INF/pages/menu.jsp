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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
ul {
    list-style-type: none;
    margin: 20% 20%;
    padding: 0;
    border-left:5px;
    overflow: hidden;
    background-color: #4CAF50;
    line-height: 60%;
}

li {
    float: left;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 50px 85px;
    text-decoration: none;
}

a:hover:not(.active) {
    background-color: #111;
}

.active {
background-color:#333;
}
</style>
</head>
<body>
	<ul>
  <li><a class="active" href="#home">Home</a></li>
  <li><a href="student-login">Student</a></li>
  <li><a href="faculty-login">Faculty</a></li>
  <li><a href="${url}/aboutus">About Us</a></li>
  <li><a href="${url}/contactus">Contact Us</a></li>
</ul>
	
</body>
</html>