<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="${url}/contactus">
<table>
	<tr>
		<td>Getting in touch is easy</td>
		<td><input type="text" style="color:#888;" 
    value="Your Name" onfocus="inputFocus(this)" onblur="inputBlur(this)"></td>
	</tr>
	<tr>
		<td></td>
		<td><input type="text" style="color:#888;" 
    value="Your Email" onfocus="inputFocus(this)" onblur="inputBlur(this)"></td>
	</tr>
	<tr>
		<td></td>
		<td><input type="text" style="color:#888;" 
    value="Write Us about any Project. We'd love to work with you!!" onfocus="inputFocus(this)" onblur="inputBlur(this)"></td>
	</tr>
</table>
</form>
</body>
</html>