package base;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author:xiang
 * @Date:2020/6/4 20:43
 */
public class Server {
    public static int PORT=9999;

    private static ExecutorService POOL= Executors.newFixedThreadPool(4);

    public static void main(String[] args) throws IOException {
        //启动了服务端程序，netstat -ano|findstr "9999"  可以显示进程pid
        ServerSocket server=new ServerSocket(PORT);
        //阻塞等待客户端连接，有新的连接来，往下执行
        Socket client=server.accept();
        POOL.submit(new serverTask(client));
    }

    public static class serverTask implements Runnable{
        private Socket client;

        public serverTask(Socket client) {
            this.client = client;
        }

        @Override
        public void run() {
            try {
                InputStream is=client.getInputStream();
                InputStreamReader isr=new InputStreamReader(is,"utf-8");
                BufferedReader br=new BufferedReader(isr);

                OutputStream os=client.getOutputStream();
                PrintWriter pw=new PrintWriter(os,true);

                String line ;
                while ((line=br.readLine())!=null){
                    System.out.println("接收客户端数据："+line);
                    pw.println("响应;"+line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
