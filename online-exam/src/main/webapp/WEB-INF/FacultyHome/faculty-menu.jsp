<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<c:set var="url" value="${pageContext.request.contextPath}"/>
<style>
table {
    border-collapse: collapse;
    width: 30%;
}

th, td {

	font-weight:bold;
    padding: 8px;
    text-align: left;
    border-bottom: 1px solid #ddd;
}
</style>
</head>
<body>
<table>
	<tr>
    <th><a href="${url}/faculty/${facultyId}/home">Home</a></th>
  </tr>
  <tr>
    <th><a href="${url}/faculty/${facultyId}/profile">Profile</a></th>
  </tr>
  <tr>
    <td><a href="${url}/post-exam/faculty/${facultyId}">Post-Exam</a></td>
  </tr>
  <tr>
    <td>View Results</td>
  </tr>
</table>
</body>
</html>