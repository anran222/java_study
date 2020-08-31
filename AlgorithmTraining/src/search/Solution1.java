package search;
/*
 *@Author:anran
 *@Date:2020/8/31
 *@Version 1.0
 * 员工的重要性
 * 比如，员工1是员工2的领导，员工2是员工3的领导。
 * 他们相应的重要度为15, 10, 5。
 * 那么员工1的数据结构是[1, 15, [2]]，员工2的数据结构是[2, 10, [3]]，员工3的数据结构是[3, 5, []]。
 * 注意虽然员工3也是员工1的一个下属，但是由于并不是直系下属，因此没有体现在员工1的数据结构中。
 * 现在输入一个公司的所有员工信息，以及单个员工id，返回这个员工和他所有下属的重要度之和。
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1 {
    static class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }

    public int getImportance(List<Employee> employees, int id) {
        Map<Integer,Employee> map=new HashMap<>();
        for (Employee cur:employees) {
            map.put(cur.id,cur);
        }
        return DFS(map,id);
    }

    public static int DFS(Map<Integer,Employee> info,int id){
        int curImportance=info.get(id).importance;
        for (int cur:info.get(id).subordinates) {
            curImportance+=DFS(info,cur);
        }
        return curImportance;
    }
}
