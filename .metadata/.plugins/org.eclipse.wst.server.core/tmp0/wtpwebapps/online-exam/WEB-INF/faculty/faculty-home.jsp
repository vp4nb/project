<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<c:set var="url" value="${pageContext.request.contextPath}"/>
<style>
div.img {
    margin: 5px;
    border: 1px solid #ccc;
    float: left;
    width: 180px;
height: 150px;

}	

div.img img {
    width: 100%;
    height: 100%;
}

div.desc {
    padding: 15px;
    text-align: center;
    font-weight:bold;

}
</style>
</head>
<center>
<body>
<div align="center">
	<p style="color:blue;"> Welcome ${faculty.name}</p>
	<div class="img">
  <a href="${url}/faculty/${facultyId}/profile">
    <img src="https://t2.ftcdn.net/jpg/00/23/87/73/500_F_23877382_z5QgVxPUd5WftpUSyEDzD6wYNVGuNFuC.jpg" alt="Trolltunga Norway" width="600" height="400">
  </a>
  <div class="desc">Profile</div>
</div>

<div class="img">
  <a href="${url}/post-exam/faculty/${facultyId}">
    <img src="http://2.bp.blogspot.com/-IwKGhfEqv1I/VmGq8IfzBJI/AAAAAAAAAVg/U2EzsxXRY6E/s1600/result.png" alt="Forest" width="300" height="50">
  </a>
  <div class="desc">Post-Exam</div>
</div>

<div class="img">
  <a target="_blank" href="img_lights.jpg">
    <img src="http://www.kjprnews.com/task_report_hot.png" alt="Northern Lights" width="300" height="50">
  </a>
  <div class="desc">View Results</div>
</div>
</div>
</body>
</center>
</html>