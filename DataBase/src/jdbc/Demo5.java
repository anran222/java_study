package jdbc;

import java.sql.*;

/**
 * @Author:xiang
 * @Date:2020/3/24 16:48
 * 输出account表内容
 */
public class Demo5 {
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement=null;
        ResultSet rs=null;
        try {
            System.out.println("id"+"   "+"name"+"   "+"balance");
            //1、注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2、获取连接对象
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","xar19990313");
            //3、获取执行sql语句的Statement对象
            statement=connection.createStatement();
            //4、定义sql语句
            String sql="select *from account";
            //5、执行sql语句
            rs=statement.executeQuery(sql);
            //6、处理结果
            //6.1 让游标向下移动一行
            rs.next();
            //6.2  获取数据
            int id=rs.getInt("id");
            String name=rs.getString("name");
            int balance=rs.getInt("balance");
            System.out.println(id+"   "+name+"   "+balance);
        } catch (ClassNotFoundException e) {
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
    }
}
