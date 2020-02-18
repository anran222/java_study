package study4;

import java.io.*;

/**
 * @Author:xiang
 * @Date:2020/2/18 15:26
 * 打印流
 */
public class PrintStream1 {
    public static void main(String[] args) throws FileNotFoundException {
       PrintStream ps=System.out;
        ps.println("打印流");
        ps.println(true);
        ps=new PrintStream(new BufferedOutputStream(new FileOutputStream("print.txt")),true);
        ps.println("打印流");
        ps.println(true);
        //重定向输出端
        System.setOut(ps);
        System.out.println("change");
        //重定向会控制台
        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out))));
        System.out.println("im back");
    }
}
