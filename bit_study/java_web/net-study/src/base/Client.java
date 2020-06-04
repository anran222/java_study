package base;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author:xiang
 * @Date:2020/6/4 21:07
 */
public class Client {

    //本机IP：特殊的IP，127.0.0.1
    private static String Host="127.0.0.1";

    public static void main(String[] args) throws IOException {
        //创建了基于TCP协议的客户端到服务端连接
        Socket client = new Socket(Host, Server.PORT);
        InputStream is = client.getInputStream();
        InputStreamReader isr = new InputStreamReader(is, "utf-8");
        BufferedReader br = new BufferedReader(isr);

        OutputStream os = client.getOutputStream();
        PrintWriter pw = new PrintWriter(os, true);

        Scanner sc=new Scanner(System.in);
        while (sc.hasNextLine()){
            String line=sc.nextLine();
            pw.println(line);
            String response=br.readLine();
            System.out.println("服务端响应："+response);
        }
    }
}
