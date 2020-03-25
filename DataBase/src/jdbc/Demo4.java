package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author:xiang
 * @Date:2020/3/24 16:48
 * 给account表删除一条记录
 */
public class Demo4 {
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement=null;
        try {
            //1、注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2、获取连接对象
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","xar19990313");
            //3、获取执行sql语句的Statement对象
            statement=connection.createStatement();
            //4、定义sql语句
            String sql="delete from account where id=3";
            //5、执行sql语句
            int count=statement.executeUpdate(sql);
            //6、处理结果
            System.out.println(count);
            if (count>0){
                System.out.println("删除成功！");
            }else{
                System.out.println("删除失败！");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            //7、释放资源
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
