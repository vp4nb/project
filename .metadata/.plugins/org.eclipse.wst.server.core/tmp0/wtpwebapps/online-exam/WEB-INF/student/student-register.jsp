<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:set var="url" value="${pageContext.request.contextPath}"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#66ccff">
<h1 align="center">STUDENT REGISTRATION</h1>
	<form:form action="${url}/student-register" method="post" modelAttribute="student">
	<table align="center">
		<tr>
			<td></td>
			<td><b style="color:red">${exceptionDetails}</b></td>
			<td></td>
		</tr>
		<tr>
			<td><form:label path="name"/>
			Full Name: </td>
			<td><form:input path="name"/></td>
			<td><form:errors path="name" cssStyle="color:red"/></td>
		</tr>
		<tr>
			<td><form:label path="userName"/>
			User Name: </td>
			<td><form:input path="userName"/></td>
			<td><form:errors path="userName" cssStyle="color:red"/></td>
		</tr>
		<tr>
			<td><form:label path="passWord"/>
			Password: </td>
			<td><form:password path="passWord"/></td>
			<td><form:errors path="passWord" cssStyle="color:red"/></td>
		</tr>
		<tr>
			<td><form:label path="rePassWord"/>
			Confirm Password: </td>
			<td><form:password path="rePassWord"/></td>
			<td><form:errors path="rePassWord" cssStyle="color:red"/></td>
		</tr>
		<tr>
			<td><form:label path="email"/>
			Email: </td>
			<td><form:input path="email"/></td>
			<td><form:errors path="email" cssStyle="color:red"/></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="submit"/></td>
			<td></td>
		</tr>
	</table>
	</form:form>
</body>
</html>