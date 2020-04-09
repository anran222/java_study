package test;

/**
 * @Author:xiang
 * @Date:2020/4/9 15:29
 * 原地算法压缩字符串
 */
public class Test4 {
    public static void main(String[] args) {

    }

    public static int compress(char[] chars) {
        int t = 0;//设置指针
        int i = 0;
        while (i < chars.length && t < chars.length) {//遍历字符串
            chars[t++] = chars[i];//取相同字符序列的首字符存下
            int temp = i;//记录相同字符序列首元素位置
            while (i < chars.length && chars[i] == chars[t - 1])
                i++;//i指针滑动到相同字符序列末尾的下一个位置
            if (i - temp > 1) {//若相同字符序列长度大于1
                for (char c : String.valueOf(i - temp).toCharArray()) {//向结果中加入相同字符序列的长度的字符形式
                    chars[t++] = c;
                }
            }
        }
        return t;//t即为已压缩的结果的长度
    }
}
