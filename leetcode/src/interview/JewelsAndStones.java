package interview;

/**
 * @Author:xiang
 * @Date:2020/5/26 22:24
 * 宝石和石头
 */
public class JewelsAndStones {
    public static void main(String[] args) {
        String J="z";
        String S="ZZZ";
        System.out.println(numJewelsInStones(J,S));
    }

    public static int numJewelsInStones(String J, String S) {
        char[] j=J.toCharArray();
        char[] s=S.toCharArray();
        int count=0;
        for (int i = 0; i <J.length() ; i++) {
            for (int k = 0; k <S.length() ; k++) {
                if (s[k]==j[i]){
                    count++;
                }
            }
        }
        return count;
    }
}
