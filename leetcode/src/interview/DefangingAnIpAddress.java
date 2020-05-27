package interview;

/**
 * @Author:xiang
 * @Date:2020/5/27 21:40
 * ip地址无效化
 */
public class DefangingAnIpAddress {
    public static void main(String[] args) {
        String address="1.1.1.1";
        System.out.println(defangIPaddr(address));
    }

    public static String defangIPaddr(String address) {
        char[] chars=address.toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <chars.length ; i++) {
            if ('.'==chars[i]){
                sb.append("[.]");
            }else {
                sb.append(chars[i]);
            }
        }
        String str=new String(sb);
        return str;
    }
}
