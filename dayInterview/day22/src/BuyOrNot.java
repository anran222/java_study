import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/6/27 13:56
 * 到底买不买
 */
public class BuyOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            buy(str1, str2);
        }
    }
    public static void buy(String str1,String str2){
        char[] chars1=str1.toCharArray();
        char[] chars2=str2.toCharArray();
        List<Character> list=new LinkedList();
        for (int i = 0; i <chars1.length ; i++) {
            list.add(chars1[i]);
        }
        int count=0;
        for (int j = 0; j <chars2.length ; j++) {
            for (int i = 0; i <list.size() ; i++) {
                if (list.get(i)==chars2[j]){
                    list.remove(i);
                    count++;
                    break;
                }
            }
//                if (list.contains(chars2[j])){
//                    list.remove(chars2[j]);
//                    count++;
//            }
        }
            if (count==chars2.length){
                System.out.print("Yes"+" "+list.size());
            }else {
                System.out.print("No"+" "+(chars2.length-count));
            }
    }
}
