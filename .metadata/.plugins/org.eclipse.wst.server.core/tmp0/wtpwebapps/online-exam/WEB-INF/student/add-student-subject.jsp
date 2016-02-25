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
<body>
<table>
	<tr>
	<td>Id:</td>
	<td>${student.id }</td>
	<td></td>
	</tr>
	<tr>
	<td>Name:</td>
	<td>${student.name}</td>
	<td><a href="">update</a></td>
	</tr>
	<tr>
	<td>User Name:</td>
	<td>${student.userName}</td>
	<td><a href="">update</a></td>
	</tr>
	<tr>
	<td>Email:</td>
	<td>${student.email}</td>
	<td><a href="">update</a></td>
	</tr>
	<tr>
	<td>Subjects:</td>
	<td colspan="2">
		<table>
		<c:forEach var="sub" items="${subjectList}">
			<tr>
			<td><a href="${url}/student/${studentId}/subject/${sub.id}">${sub.subject}</a></td>
			</tr>
		</c:forEach>
		</table>
	</td>
	</tr>
	<tr>
	<td></td>
	<td colspan="2">
		<form:form action="${url}/student/${studentId}/subject/add" method="post" modelAttribute="subject">
	<table>
		<tr>
			<td></td>
			<td><b style="color: red">${message}</b></td>
			<td></td>
		</tr>
		<tr>
			<td><form:label path="subject"/>New Subject: </td>
			<td><form:input path="subject"/></td>
			<td><form:errors path="subject" cssStyle="color:red"/></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="submit"/></td>
			<td></td>
		</tr>
	</table>
	</form:form>
	</td>
	</tr>
</table>

</body>
</html>