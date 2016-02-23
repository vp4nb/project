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
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
${subject.subject}
 <table>
		<c:forEach var="list" items="${testList}">
			<tr>
			<td>${list.test}</td>
			<td><a href="${url}/post-exam/faculty/${facultyId}/subject/${subject.id}/test/${list.id}/view">view</a></td>
			<td><a href="${url}/post-exam/faculty/${facultyId}/subject/${subject.id}/test/${list.id}/add">add questions</a></td>
			<td><a href="${url}/post-exam/faculty/${facultyId}/subject/${subject.id}/test/${list.id}/delete">delete</a></td>
			</tr>
		</c:forEach>
</table>
<br/>
<form:form action="${url}/post-exam/faculty/${facultyId}/subject/${subject.id}/test/add" method="post" modelAttribute="subjectTest">
	<table>
		
		<tr>
			<td></td>
			<td>${message}</td>
			<td></td>
		</tr>
		<tr>
			<td><form:label path="test"/></td>
			<td><form:input path="test"/></td>
			<td><form:errors path="test" cssStyle="color:red"/></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="submit"/></td>
			<td></td>
		</tr>
	</table>
	</form:form>
</html>