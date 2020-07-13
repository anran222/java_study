import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/7/13 18:09
 */
public class AlphabeticStatistics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            int[] count = new int[26];
            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    count[ch - 'A']++;
                }
            }
            for (int i = 0; i < 26; i++) {
                System.out.printf("%c:%d%n",('A'+i),count[i]) ;
            }
        }
    }
}
