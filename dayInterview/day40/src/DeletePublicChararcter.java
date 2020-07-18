import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/7/18 17:33
 * 删除公共字符
 */
public class DeletePublicChararcter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            delete(s1,s2);
        }
    }

    public static void delete(String s1,String s2){
        char[] a1=s1.toCharArray();
        for (int i = 0; i <a1.length ; i++) {
            if (!s2.contains(String.valueOf(a1[i]))){
                System.out.print(a1[i]);
            }
        }
    }
}
