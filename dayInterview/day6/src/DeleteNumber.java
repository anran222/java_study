import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/6/8 21:11
 * 删数
 */
public class DeleteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n > 999) {
                n = 999;
            }
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(i);
            }
            int m = 0;
            while (list.size() > 1) {
                m = (m + 2) % list.size();
                list.remove(m);
            }
            System.out.println(list.get(0));
        }
    }
}
