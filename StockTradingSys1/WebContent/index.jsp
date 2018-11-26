<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to SharePrice</title>
</head>
<body>


<h1>Welcome to SharePrice</h1>

<table border="2">
<tr><th><h2>Stock

<th><h2>Quote</th>

<tr>

<c:forEach items="${list}" var="trade">

<tr><td><h3><a href="setAnOrder.obj?stockId=${trade.stockCode}">

${trade.stock}</a></td>

 <td><h3>${trade.quote}</td>
 </tr>
</c:forEach>





</table>

</body>
</html>