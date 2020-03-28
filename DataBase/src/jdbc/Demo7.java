package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @Author:xiang
 * @Date:2020/3/27 22:24
 * JDBC管理事务
 */
public class Demo7 {
    public static void main(String[] args) {
        Connection connection=null;
        PreparedStatement pstmt1=null;
        PreparedStatement pstmt2=null;
        try {
            //1、注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2、获取连接对象
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","xar19990313");
            //开启事务
            connection.setAutoCommit(false);
            //3、定义sql语句
            String sql1="update account set balance=balance-? where id=?";
            String sql2="update account set balance=balance+? where id=?";
            //4、获取执行sql对象
            pstmt1=connection.prepareStatement(sql1);
            pstmt2=connection.prepareStatement(sql2);
            //5、设置参数
            pstmt1.setInt(1,500);
            pstmt1.setInt(2,1);
            pstmt2.setInt(1,500);
            pstmt2.setInt(2,2);
            //6、执行sql语句
            pstmt1.executeUpdate();
            pstmt2.executeUpdate();
            //提交事务
            connection.commit();
        } catch (Exception e) {
            //事务回滚
            if (connection!=null){
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
        }finally {
            //7、释放资源
            if (connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt1!=null){
                try {
                    pstmt1.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt2!=null){
                try {
                    pstmt2.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
