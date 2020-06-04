import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/6/4 22:14
 * 字符串中找出连续最长的数字串
 */
public class TheLongNumberString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(find(s));
    }

    public static String find(String s){
        char[] chars=s.toCharArray();
        int max=0;
        int count=0;
        int end=0;
        for (int i = 0; i <chars.length ; i++) {
            if (chars[i]>='0'&&chars[i]<='9'){
                count++;
                if (max<count){
                    max=count;
                    end=i;
                }
            }else {
                count=0;
            }
        }
        return String.valueOf(s.substring(end-max+1,end+1));
    }
}
