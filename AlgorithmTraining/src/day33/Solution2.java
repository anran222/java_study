package day33;
/*
 *@Author:anran
 *@Date:2020/9/14
 *@Version 1.0
 * 成绩排序
 */

import java.util.*;

public class Solution2 {
    static class Student{
        String name;
        int grade;

        public Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int num=sc.nextInt();
            int flag=sc.nextInt();
            List<Student> list=new LinkedList<>();
            for (int i = 0; i <num ; i++) {
                list.add(new Student(sc.next(),sc.nextInt()));
            }
            if (flag==0){
                list.sort((o1,o2)->o2.grade-o1.grade);
            }else if (flag==1){
                list.sort((o1,o2)->o1.grade-o2.grade);
            }
            for (Student s:list) {
                System.out.println(s.name+" "+s.grade);
            }
        }
    }
}
