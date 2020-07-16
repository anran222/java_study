/**
 * @Author:xiang
 * @Date:2020/7/16 15:01
 * 空格替换
 */
public class SpaceSubstition {
    public static void main(String[] args) {
        String str="Mr john smith";
        int length=13;
        System.out.println(replaceSpace(str,length));
    }

    public static String replaceSpace(String iniString,int length){
        char[] chars=iniString.toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <length ; i++) {
            if (chars[i]==' '){
                sb.append("%20");
            }else {
                sb.append(chars[i]);
            }
        }
        return String.valueOf(sb);
    }
}
