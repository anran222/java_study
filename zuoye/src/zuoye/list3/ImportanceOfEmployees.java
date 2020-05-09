package zuoye.list3;

import java.util.List;

/**
 * @Author:xiang
 * @Date:2020/5/9 14:31
 * 员工的重要性
 */
public class ImportanceOfEmployees {
    public static void main(String[] args) {

    }

    static class Employee{
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }

    private static int result;
    public static int getImportance(List<Employee> employees, int id) {
        for (Employee e:employees) {
            if (e.id==id){
                result+=e.importance;
            }
            if (e.subordinates.size()==0){
                return result;
            }
            for (int i:e.subordinates) {
                getImportance(employees,i);
            }
        }
        return result;
    }
}
