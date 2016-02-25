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
<h2>Subjects List</h2>
 <c:forEach var="subject" items="${subjectList}">
     <br/> <a href="${url}/post-exam/faculty/${facultyId}/subject/${subject.id}">${subject.subject}</a><br/>
</c:forEach>
<br/>
<form:form action="${url}/post-exam/faculty/${facultyId}/subject/add" method="post" modelAttribute="subject">
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
</body>
</html>