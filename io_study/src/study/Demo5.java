package study;

import java.io.File;

/**
 * @Author:xiang
 * @Date:2020/2/12 20:04
 * 打印子孙级目录和文件的名称
 */
public class Demo5 {
    public static void main(String[] args) {
        File src = new File("G:/io_study");
        printName(src,0);
    }
        public static void printName(File src,int deep){
            for (int i = 0; i <deep ; i++) {
                System.out.println("--");
            }
            System.out.println(src.getName());
            if (null==src||!src.exists()){
                return ;
            }else if(src.isDirectory()){
                for (File s: src.listFiles()){
                    printName(s ,deep+1);
                }
            }
        }
}
