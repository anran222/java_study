package interview;

/**
 * @Author:xiang
 * @Date:2020/4/27 11:40
 * 替换空格
 */
public class ReplaceSpace {
    public static void main(String[] args) {
        String s="we are happy";
        System.out.println(replaceSpace(s));
    }

    public static String replaceSpace(String s) {
        StringBuilder sb=new StringBuilder();
        char[] arr=s.toCharArray();
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==' '){
                sb.append("%20");
            }else {
                sb.append(arr[i]);
            }
        }
        String str=new String(sb);
        return str;
    }
}
