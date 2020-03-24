package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author:xiang
 * @Date:2020/3/24 16:27
 * 给account表添加一条insert语句
 */
public class Demo2 {
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement=null;
        try {
            //1、注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2、定义sql
            String sql="insert into account value(3,'wangwu',3000)";
            //3、获取Connection对象
                connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","xar19990313");
            //4、获取执行sql的对象Statement
            statement=connection.createStatement();
            //5、执行sql语句
            int count=statement.executeUpdate(sql);
            //6、处理结果
            System.out.println(count);
            if (count>0){
                System.out.println("添加成功");
            }else{
                System.out.println("添加失败");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        finally {
            //7、释放资源
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
