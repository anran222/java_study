import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/7/2 23:23
 * 整数与ip地址之间的转换
 */
public class ConversionBetweenIpAddressAndInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s=sc.nextLine();
            String s1=sc.nextLine();
            System.out.println(ipToLong(s));
            longToIp(s1);
        }
    }
    public static long ipToLong(String s){
        String[] str=s.split("\\.");
        long n=Long.parseLong(str[0]);
        for (int i = 1; i <str.length ; i++) {
            n<<=8;
            n+=Long.parseLong(str[i]);
        }
        return n;
    }
    public static void longToIp(String s){
        long temp=Long.parseLong(s);
        String ip=Long.toBinaryString(temp);
        StringBuilder sb=new StringBuilder();
        while (ip.length()<32) {
            ip = "0" + ip;
        }
            ip=ip.substring(ip.length()-32);
            sb.append(ip);
        for (int i = 0; i <sb.length()-8 ; i+=8) {
            System.out.print(Integer.parseInt(sb.substring(i, i + 8), 2) + ".");
        }
            System.out.println(Integer.parseInt(sb.substring(sb.length()-8),2));
    }
}
