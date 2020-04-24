<%@ page import="java.util.List" %>
<%@ page import="org.student.entity.Student" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/4/23
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>学生信息列表</title>
  </head>
  <body>
      <table border="1px">
        <tr>
          <th>学号</th>
          <th>姓名</th>
          <th>年龄</th>
          <th>地址</th>
          <th>操作</th>
        </tr>
        <%
          List<Student> students=(List<Student>) request.getAttribute("Students");
          for (Student student:students){
        %>
        <tr>
          <td><a href="QueryStudentBySnoServlet?sno=<%=student.getSno()%>"><%=student.getSno()%></a></td>
          <td><%=student.getSname()%></td>
          <td><%=student.getSage()%></td>
          <td><%=student.getSaddress()%></td>
          <td><a href="DeleteStudentServlet?sno=<%=student.getSno()%>">删除</a> </td>
        </tr>
        <%
          }
        %>
      </table>
      <a href="add.jsp">新增</a>
  </body>
</html>
