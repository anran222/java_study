<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/4/22
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <%  Connection connection=null;
            Statement statement=null;
            ResultSet rs=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "xar19990313");
            statement=connection.createStatement();
            String name = request.getParameter("uname");
            String password = request.getParameter("pwd");
            String sql="select * from test2 where id=name and pwd=password";
                    rs=statement.executeQuery(sql);
                    int count=-1;
                    if (rs.next()){
                        count=rs.getInt(1);
                    }
                    if (count>0){
                        out.print("登录成功！");
                    }else {
                        out.print("登录失败！");
                    }

        }catch (ClassNotFoundException e) {
            e.printStackTrace();
            } catch (SQLException e) {
            e.printStackTrace();
            }
            finally {
            //7、释放资源
            if (rs!=null){
            try {
            rs.close();
            } catch (SQLException e) {
            e.printStackTrace();
            }
            }
            if (statement!=null){
            try {
            statement.close();
            } catch (SQLException e) {
            e.printStackTrace();
            }
            }
            if (connection!=null){
            try {
            connection.close();
            } catch (SQLException e) {
            e.printStackTrace();
            }
            }
            }
        %>
</body>
</html>
