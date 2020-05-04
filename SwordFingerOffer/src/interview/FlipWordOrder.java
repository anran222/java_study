package interview;

/**
 * @Author:xiang
 * @Date:2020/5/4 23:35
 * 翻转单词顺序
 */
public class FlipWordOrder {
    public static void main(String[] args) {
        System.out.println(reverseWords("hello world"));
    }

    public static String reverseWords(String s) {
        String[] a=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for (int i = a.length-1; i >= 0; i--) {
            if (!a[i].equals(" ")){
                sb.append(a[i]);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}
