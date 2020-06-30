import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/6/30 23:23
 * 计票统计
 */
public class CountingOfVotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            HashMap<String, Integer> hashMap = new LinkedHashMap<>();
            for (int i = 0; i < n; i++) {
                hashMap.put(sc.next(), 0);
            }
            int m = sc.nextInt();
            int Invaild = 0;
            for (int i = 0; i < m; i++) {
                String s = sc.next();
                if (hashMap.containsKey(s)) {
                    hashMap.put(s, hashMap.get(s) + 1);
                } else {
                    Invaild++;
                }
            }
                for (String str : hashMap.keySet()) {
                    System.out.println(str + ":" + hashMap.get(str));
                }
                System.out.println("Invaild" + ":" + Invaild);
        }
    }
}
