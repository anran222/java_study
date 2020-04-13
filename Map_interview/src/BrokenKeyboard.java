import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author:xiang
 * @Date:2020/4/13 22:44
 * 旧键盘
 */
public class BrokenKeyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            // 1. 循环读入两个字符串. 第一个字符串是预期输出的内容; 第二个字符串是实际输出的内容
            String expected = scanner.next();
            String actual = scanner.next();
            // 2. 把读入的两个字符串全都转成大写(根据题目的输出示例).
            expected = expected.toUpperCase();
            actual = actual.toUpperCase();
            // 3. 创建一个 Set 保存实际哪些字符输出了
            Set<Character> actualSet = new HashSet<>();
            for (int i = 0; i < actual.length(); i++) {
                actualSet.add(actual.charAt(i));
            }
            // 4. 遍历预期输出的字符串, 看看哪个字符没有被实际输出
            Set<Character> brokenKeySet = new HashSet<>();
            for (int i = 0; i < expected.length(); i++) {
                char c = expected.charAt(i);
                if (actualSet.contains(c)) {
                    // 当前字符已经被输出了, 就是一个好的键.
                    continue;
                }
                // 当前这个键没被实际输出, 就是坏了的键.
                // 输出格式非常重要, 要不要空格, 要不要换行, 这些细节都很重要.
                // 这里还要考虑一个问题, 当前的坏键去重问题.
                if (brokenKeySet.contains(c)) {
                    // 此处的 brokenKeySet 用于辅助去重. 防止同一个坏键被打印多次
                    continue;
                }
                System.out.print(c);
                brokenKeySet.add(c);
            }   // end for
        }  // end while
    }
}
