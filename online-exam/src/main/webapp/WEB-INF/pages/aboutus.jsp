<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<c:set var="url" value="${pageContext.request.contextPath}"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
 p.first:first-letter{
               text-transform: uppercase;
          }
        p.first {
        color: #424242;
        font-family: "Adobe Caslon Pro", "Hoefler Text", Georgia, Garamond, Times, serif;
	letter-spacing:0.1em;
	text-align:center;
	margin: 40px auto;
	text-transform: lowercase;
	line-height: 145%;
	font-size: 14pt;
	font-variant: small-caps;
        }
p.second
{
	font-family:  'Hoefler Text', Georgia, 'Times New Roman', serif;
	font-weight: normal;
    font-size: 1.75em;
	letter-spacing: .2em;
	line-height: 1.1em;
	margin:0px;
	text-align: center;
	text-transform: uppercase;
}
</style>
</head>
<body>
	<p class="first">If you're just curious about our story, or you just want to take our exam, you're in the right spot</p>
	<p style="color:red;font-size:25px;">About us</p>
	<p class="second">We're a SMART Team that believes in having a good time while doing what we love, and we do love what we do</p>
</body>
</html>