package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @Author:xiang
 * @Date:2020/3/24 14:28
 * 快速入门
 */
public class Demo1 {
    public static void main(String[] args) throws Exception {
        //1、导入驱动jar包
        //2、注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //3、获取数据库连接对象 Connection
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","xar19990313");
        //4、定义sql
        String sql="update student set age=20 where id=1";
        //5、获取执行sql语句的对象 Statement
        Statement statement=connection.createStatement();
        //6、执行sql，接收返回结果
        int count=statement.executeUpdate(sql);
        //7、处理结果
        System.out.println(count);
        //8、释放资源
        statement.close();
        connection.close();
    }
}
