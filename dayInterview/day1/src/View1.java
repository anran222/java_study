/**
 * @Author:xiang
 * @Date:2020/6/1 17:51
 * 统计回文
 */
public class View1 {
    public static void main(String[] args) {
        String A="aba";
        String B="b";
        System.out.println(sun(A,B));
    }

    private static int sun(String a,String b){
        char[] ch=a.toCharArray();
        int count=0;
        StringBuilder sb=new StringBuilder();
        int m=0;
        while (m<ch.length) {
            for (int i = 0; i <= m; i++) {
                sb.append(ch[i]);
            }
            sb.append(b);
            for (int i = m + 1; i < ch.length; i++) {
                sb.append(ch[i]);
            }
            if (huiWen(String.valueOf(sb)) == true) {
                count++;
            }
            m++;
        }
        StringBuilder sb2=new StringBuilder();
        if (huiWen(String.valueOf(sb2.append(a).append(b)))==true){
            count++;
        }
        StringBuilder sb3=new StringBuilder();
        if (huiWen(String.valueOf(sb3.append(b).append(a)))==true){
            count++;
        }
        return count;
    }

    private static boolean huiWen(String s){
        char[] ch=s.toCharArray();
        char[] ch2=new char[ch.length];
        int j=0;
        for (int i = ch.length-1; i >=0 ; i--) {
                ch2[j]=ch[i];
                j++;
        }
        for (int i = 0; i <ch.length ; i++) {
            if (ch[i]!=ch2[i]){
                return false;
            }
        }
        return true;
    }
}
