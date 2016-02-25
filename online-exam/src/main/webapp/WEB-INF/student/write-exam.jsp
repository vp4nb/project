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
<h2>Subject List</h2>
 <c:forEach var="subject" items="${subjectList}">
     <br/> <a href="${url}/post-exam/student/${studentId}/subject/${subject.id}">${subject.subject}</a><br/>
</c:forEach>
<br/> <a href="${url}/post-exam/student/${studentId}/subject/add">+ add more</a><br/>
</body>
</html>