<%--
  Created by IntelliJ IDEA.
  User: Konrad
  Date: 20.05.2018
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LoginToServis</title>
</head>
<body>
<form method="post" action="login">
    First name: <input type="text" name="userLogin"/>
    Password: <input type="text" name="password"/>
    <p>${imie}</p>
    <input type="submit" value="login"/>
</form>
</body>
</html>
