package org.student.service;

import org.student.dao.StudentDao;
import org.student.entity.Student;

import java.util.List;

/**
 * @Author:xiang
 * @Date:2020/4/23 22:53
 * 业务逻辑层
 */
public class StudentService {
    StudentDao studentDao=new StudentDao();

    //添加学生
    public boolean addStudent(Student student){
        if (studentDao.isExist(student.getSno())==false){
            studentDao.addStudent(student);
            return true;
        }else {
            System.out.println("此人已存在！");
            return false;
        }
    }

    //删除学生
    public boolean deleteStudentBySno(int sno){
        if (studentDao.isExist(sno)) {
           return studentDao.deleteStudent(sno);
        }else {
            return false;
        }
    }

    //修改学生信息
    public boolean updateStudentBySno(int sno,Student student){
        if (studentDao.isExist(sno)){
            return studentDao.updateStudentBySno(sno,student);
        }else {
            return false;
        }
    }

    //查询学生
    public Student queryStudentBySno(int sno){
        return studentDao.queryStudentSno(sno);
    }

    //查询全部学生
    public List<Student> queryAllStudents(){
        return studentDao.queryAllStudents();
    }
}
