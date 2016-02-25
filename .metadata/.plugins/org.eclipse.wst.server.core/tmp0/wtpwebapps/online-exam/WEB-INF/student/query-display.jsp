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
<form:form method="POST" action="${url}/write-exam/student/${studentId}/subject/${subjectId}/test/${testNumber}/write" modelAttribute="userOption">
<table>
 <tr>
    <td> <b style="color: red">${question.question}</b></td>
    </tr>
    <tr>
    <td><form:radiobutton path="userOption" value="A"/>A).${question.option1}</td>
    </tr>
    <tr>
    <td><form:radiobutton path="userOption" value="B"/>B).${question.option2}</td>
    </tr>
    <tr>
    <td><form:radiobutton path="userOption" value="C"/>C).${question.option3}</td>
    </tr><tr>
    <td><form:radiobutton path="userOption" value="D"/>D).${question.option4}</td>
    </tr>
    <tr><td><input type="submit" value="${type}"/></td>
  </tr>
</table>
</form:form>
</body>
</html>