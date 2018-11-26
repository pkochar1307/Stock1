<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to SharePrice</h1>

<sf:form action="giveOrder.obj" modelAttribute="share">

<table border="2">

<tr><td>Stock <td><sf:input path="stock" readonly="true"/><br>
<tr><td>Quote <td><sf:input path="quote" readonly="true"/><br>

<tr><td>Select action <td> 

<input type="radio" name="selectaction" value="Buy" />Buy<br>

<input type="radio" name="selectaction" value="Sell" />Sell</tr>

<tr><td>Quantity<td> <input type="number" name="qty"/><br>
<input type="submit" value="Order"/>
</table>
</sf:form>

</body>

</body>
</html>