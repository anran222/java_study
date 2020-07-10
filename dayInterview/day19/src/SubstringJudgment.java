import java.util.Arrays;

/**
 * @Author:xiang
 * @Date:2020/6/22 21:16
 * 子串判断
 */
public class SubstringJudgment {
    public static void main(String[] args) {
        String[] str={"a","b","c","d"};
        int n=4;
        String s="abc";
        System.out.println(Arrays.toString(chkSubStr(str,n,s)));
    }

    public static boolean[] chkSubStr(String[] p, int n, String s) {
        boolean[]  booleans=new boolean[n];
        for (int i = 0; i <n ; i++) {
            booleans[i]=s.contains(p[i]);
        }
        return booleans;
    }
}
