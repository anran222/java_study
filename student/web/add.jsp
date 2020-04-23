<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/4/23
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add</title>
</head>
<body>
<form action="AddStudentServlet" method="get">
    学号：<input type="text" name="sno"><br>
    姓名：<input type="text" name="sname"><br>
    年龄：<input type="text" name="sage"><br>
    地址：<input type="text" name="saddress"><br>
    <input type="submit" value="添加"><br>
</form>
</body>
</html>
