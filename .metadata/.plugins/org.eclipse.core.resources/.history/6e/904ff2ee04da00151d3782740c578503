<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">          
  <table class="table table-hover .table-condensed .table-responsive .table-bordered">
    <thead>
      <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Password</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach var="fac" items="${faclist}">
      <tr>
        <td>${fac.id }</td>
        <td>${fac.userName }</td>
        <td>${fac.passWord }</td>
      </tr>
      </c:forEach>
    </tbody>
  </table>
</div>

</body>
</html>
	
	
	
</body>
</html>