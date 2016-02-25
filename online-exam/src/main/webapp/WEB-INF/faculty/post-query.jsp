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
<b style="color: red">${number}</b><br/>
	<form:form action="${url}/post-exam/faculty/${facultyId}/subject/${subjectId}/test/${testNumber}/add" method="post" modelAttribute="examQuestion">
	<table>
		<tr>
			<td><form:label path="question"/>
			Question: </td>
			<td><form:input path="question"/></td>
			<td><form:errors path="question" cssStyle="color:red"/></td>
		</tr>
		<tr>
			<td><form:label path="option1"/>
			Option 1: </td>
			<td><form:input path="option1"/></td>
			<td><form:errors path="option1" cssStyle="color:red"/></td>
		</tr>
		<tr>
			<td><form:label path="option2"/>
			Option 2: </td>
			<td><form:input path="option2"/></td>
			<td><form:errors path="option2" cssStyle="color:red"/></td>
		</tr>
		<tr>
			<td><form:label path="option3"/>
			Option 3: </td>
			<td><form:input path="option3"/></td>
			<td><form:errors path="option3" cssStyle="color:red"/></td>
		</tr>
		<tr>
			<td><form:label path="option4"/>
			Option 4: </td>
			<td><form:input path="option4"/></td>
			<td><form:errors path="option4" cssStyle="color:red"/></td>
		</tr>
		<tr>
			<td><form:label path="answer"/>
			Answer: </td>
			<td><form:input path="answer"/></td>
			<td><form:errors path="answer" cssStyle="color:red"/></td>
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