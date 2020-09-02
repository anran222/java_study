package day23;
/*
 *@Author:anran
 *@Date:2020/9/2
 *@Version 1.0
 * 员工的重要性
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1 {
    class Employee {
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
        int curimportance=info.get(id).importance;
        for (int cur:info.get(id).subordinates) {
            curimportance+=DFS(info,cur);
        }
        return curimportance;
    }
}
