package test;

import java.math.BigInteger;

/**
 * @Author:xiang
 * @Date:2020/4/9 15:01
 * 二进制求和
 */
public class Test3 {
    public static void main(String[] args) {
        String a="1010";
        String b="1011";
        String str=addBinary(a,b);
        System.out.println(str);
    }

    public static String addBinary(String a, String b) {
        BigInteger aa=new BigInteger(a,2);
        BigInteger bb=new BigInteger(b,2);
        BigInteger sum=aa.add(bb);
        String str=sum.toString(2);
        return str;
    }
}
