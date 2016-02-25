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
<h1>${subject.subject}</h1>
<h2>Test List</h2>
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
<br/> <a href="${url}/post-exam/faculty/${facultyId}/subject/${subject.id}/test/add">+ add more</a><br/>
</body>
</html>