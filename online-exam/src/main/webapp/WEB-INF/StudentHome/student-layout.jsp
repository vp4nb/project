<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
    .Table
    {
        display: table;
    }
    .Row
    {
        display: table-row;
    }
    #left {
		display: table-cell;
		}

	#right {
		
    display: table-cell;
		}
</style>
</head>
<center>
<body>
		 <%-- <div style="margin-bottom:10px;margin-left:140px;margin-right:140px;height:25px"><tiles:insertAttribute name="header" /></div>  
		 <div  style="margin-left:140px;margin-right:140px;width:100px; "><tiles:insertAttribute name="menu" /></div>  	
       	<div style="margin-left:140px;margin-right:140px;padding:10px;width:300px;border-left:1px solid pink;">  
        <tiles:insertAttribute name="body" /> </div>
        <div style="margin-left:140px;margin-right:140px;clear:both"><tiles:insertAttribute name="footer" /></div>   --%>

<%-- <div style="margin-bottom:10px;margin-left:140px;margin-right:140px;height:25px"><tiles:insertAttribute name="header" /></div>  
		<div class="table"><div class="row"><div class="left"><div  style="margin-left:140px;margin-right:140px;width:100px; "><tiles:insertAttribute name="menu" /></div> 	
       	<div class="right"><div style="display:tablemargin-left:140px;margin-right:140px;padding:10px;width:300px;border-left:1px solid pink;">  
        <tiles:insertAttribute name="body" /> </div></div></div>
        <div style="margin-left:140px;margin-right:140px;clear:both"><tiles:insertAttribute name="footer" /></div> --%>
 <table cellpadding="10px;" cellspacing="0" style="font:12px verdana, sans-serif; width:1000px;height:650px;margin:0 auto;">
        <tr>
            <td colspan="2" style="background-color:#679BB7;">
                <h1 style="font-size:18px; margin:10px 0;"><tiles:insertAttribute name="header" /></h1>
            </td>
        </tr>
        <tr valign="top" style="height:300px;">
            <td style="background-color:#bbd2df; width:100px; vertical-align: top;">
                <tiles:insertAttribute name="menu" />
            </td>
            <td style=" border: 1px solid #bbd2df;vertical-align: top;">
                <tiles:insertAttribute name="body" />
            </td>
        </tr>
        <tr>
            <td colspan="2" style="background-color:#679BB7;">
                <tiles:insertAttribute name="footer" />
            </td>
        </tr>
    </table>

</body>
</center>
</html>