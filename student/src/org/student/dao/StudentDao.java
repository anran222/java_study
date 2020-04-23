package org.student.dao;

import org.student.entity.Student;

import java.sql.*;

/**
 * @Author:xiang
 * @Date:2020/4/23 16:51
 */
public class StudentDao {

    private final String URL="jdbc:mysql://localhost:3306/student";
    private final String USENAME="root";
    private final String PASSWORD="xar19990313";

    //判断学生是否存在
    public boolean isExist(int sno){
        if (queryStudentSno(sno)==null){
            return false;
        }else {
            return true;
        }
    }

    public boolean addStudent(Student student){
        Connection connection=null;
        PreparedStatement pstmt=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection(URL,USENAME,PASSWORD);
            String sql="insert into student values(?,?,?,?)";
            pstmt=connection.prepareStatement(sql);
            pstmt.setInt(1,student.getSno());
            pstmt.setString(2,student.getSname());
            pstmt.setInt(3,student.getSage());
            pstmt.setString(4,student.getSaddress());
            int count=pstmt.executeUpdate();
            if (count>0){
                return true;
            }else {
                return false;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }catch (SQLException e) {
            e.printStackTrace();
            return false;
        }finally {
            try {
                if (pstmt!=null) {
                    pstmt.close();
                }
                if (connection!=null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //根据学号查找学生
    public Student queryStudentSno(int sno){
        Student student=null;
        Connection connection=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection(URL,USENAME,PASSWORD);
            String sql="select * from student where sno=?";
            pstmt=connection.prepareStatement(sql);
            pstmt.setInt(1,sno);
            pstmt.executeQuery();
            if (rs.next()){
                int no=rs.getInt("sno");
                String name=rs.getString("sname");
                int age=rs.getInt("sage");
                String address=rs.getString("saddress");
                student=new Student(no,name,age,address);
            }
            return student;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }catch (SQLException e) {
            e.printStackTrace();
            return null;
        }finally {
                try {
                    if (rs!=null) {
                        rs.close();
                    }
                    if (pstmt!=null) {
                        pstmt.close();
                    }
                    if (connection!=null) {
                        connection.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
}
