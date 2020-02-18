package study4;

import java.io.*;

/**
 * @Author:xiang
 * @Date:2020/2/18 14:39
 * 数据流
 * 1、写出后读取
 * 2、读取的顺序与写出保持一致
 */
public class DataStream {
    public static void main(String[] args) {
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        DataOutputStream dos=new DataOutputStream(new BufferedOutputStream(baos));
        try {
            dos.writeUTF("welcome tojava");
            dos.writeInt(18);
            dos.writeBoolean(true);
            dos.writeChar('a');
            dos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] datas=baos.toByteArray();
        DataInputStream dis=new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
        try {
            String msg=dis.readUTF();
            int age=dis.readInt();
            boolean flag=dis.readBoolean();
            char ch=dis.readChar();
            System.out.println(msg);
            System.out.println(age);
            System.out.println(flag);
            System.out.println(ch);
        } catch (IOException e) {
            e.printStackTrace();
        };
    }
}
