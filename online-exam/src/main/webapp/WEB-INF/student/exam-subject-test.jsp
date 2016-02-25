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
${subject.subject}
 <table>
		<c:forEach var="list" items="${testList}">
			<tr>
			<td>${list.test}</td>
			<td><a href="${url}/write-exam/student/${studentId}/subject/${subject.id}/test/${list.id}/write">write</a></td>
			</tr>
		</c:forEach>
</table>
</body>
</html>