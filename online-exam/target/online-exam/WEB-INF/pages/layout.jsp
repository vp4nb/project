<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table width="100%" height="100%">
<tr>
<td colspan="2" height="10%" align="center" style="background-color: red"><tiles:insertAttribute name="header"/></td></tr>
<tr height="80%" ><td width="20%" style="background-color: blue"><tiles:insertAttribute name="menu"/></td>
	<td style="background-color: orange; align: center" width="80%"><tiles:insertAttribute name="title"/>
		<tiles:insertAttribute name="body"/></td></tr>
<tr><td colspan="2" height="10%"><tiles:insertAttribute name="footer"/></td></tr>
</table>
</body>
</html>