package org.student.service;

import org.student.dao.StudentDao;
import org.student.entity.Student;

/**
 * @Author:xiang
 * @Date:2020/4/23 22:53
 * 业务逻辑层
 */
public class StudentService {
    StudentDao studentDao=new StudentDao();

    public boolean addStudent(Student student){
        if (!studentDao.isExist(student.getSno())){
            studentDao.addStudent(student);
            return true;
        }else {
            System.out.println("此人已存在！");
            return false;
        }
    }
}
