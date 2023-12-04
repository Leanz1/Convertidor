<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link rel="stylesheet" href="resources/css/main.css" type="text/css">

</head>
<body>
<%@ page import="com.fjavmvazquez.ejemplo07.model.Converditor" %>
<%
    Converditor cen = (Converditor) request.getAttribute("user");
%>
<h1>Calculo realizado</h1>
<p> Grados centigrados a fahrenheit: </p>
<br>
<label>Fahrenheit:</label>
<span><%= cen.getFaren()%></span><br>

<form action="" method="get">
    <input type="hidden" name="action"  value="registrar"><br>
    <input type="submit" value="Regresar">
</form>

</body>
</html>