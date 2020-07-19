import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/7/19 22:23
 * 字符串加解密
 */
public class StringEncryptionAndDecryption {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str1=sc.nextLine();
            String str2=sc.nextLine();
            Encrypt(str1);
            unEncrypt(str2);
        }
    }
    public static void Encrypt(String s){
        char[] chars=s.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            if (chars[i]>='a'&&chars[i]<'z'){
                chars[i]=(char)((chars[i]+1)-32);
            }else if (chars[i]=='z'){
                chars[i]='a';
            }else if (chars[i]>='A'&&chars[i]<'Z'){
                chars[i]=(char)((chars[i]+1)+32);
            }else if (chars[i]=='Z'){
                chars[i]='A';
            }else if(chars[i]>='0'&&chars[i]<'9'){
                chars[i]=(char)(chars[i]+1);
            }else if (chars[i]=='9'){
                chars[i]='0';
            }
        }
        System.out.println(String.valueOf(chars));
    }

    public static void unEncrypt(String s){
        char[] chars=s.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            if (chars[i]=='A'){
                chars[i]='Z';
            }else if (chars[i]>'A'&&chars[i]<='Z'){
                chars[i]=(char)((chars[i]-1)+32);
            }else if (chars[i]=='a'){
                chars[i]='z';
            }else if (chars[i]>'a'&&chars[i]<='z') {
                chars[i] = (char) ((chars[i] - 1) - 32);
            }else if (chars[i]>'1'&&chars[i]<='9'){
                chars[i]=(char)(chars[i]-1);
            }else if (chars[i]=='0'){
                chars[i]='9';
            }
        }
        System.out.println(String.valueOf(chars));
    }
}
