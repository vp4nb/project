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
	<td>${faculty.id }</td>
	<td></td>
	</tr>
	<tr>
	<td>Name:</td>
	<td>${faculty.name}</td>
	<td><a href="">update</a></td>
	</tr>
	<tr>
	<td>User Name:</td>
	<td>${faculty.userName}</td>
	<td><a href="">update</a></td>
	</tr>
	<tr>
	<td>Email:</td>
	<td>${faculty.email}</td>
	<td><a href="">update</a></td>
	</tr>
	<tr>
	<td>Subjects:</td>
	<td colspan="2">
		<table>
		<c:forEach var="sub" items="${subjectList}">
			<tr>
			<td><a href="${url}/faculty/${facultyId}/subject/${sub.id}">${sub.subject}</a></td>
			</tr>
		</c:forEach>
		</table>
	</td>
	</tr>
	<tr>
	<td></td>
	<td colspan="2">
		<form:form action="${url}/faculty/${facultyId}/subject/add" method="post" modelAttribute="subject">
	<table>
		<tr>
			<td></td>
			<td>${message}</td>
			<td></td>
		</tr>
		<tr>
			<td><form:label path="subject"/></td>
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