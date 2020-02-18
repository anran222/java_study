package study4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @Author:xiang
 * @Date:2020/2/18 16:06
 */
public class RandomStream1 {
    public static void main(String[] args) throws IOException {
        File src=new File("DataStream");
        long len=src.length();
        int blockSize=1024;
        int size=(int)Math.ceil(len*1.0/blockSize);
        System.out.println(size);
        int beginPos=0;
        int actualSize=(int)(blockSize>len?len:blockSize);
        for (int i = 0; i <size ; i++) {
            beginPos=i*blockSize;
            if (i==size-1){
                actualSize=blockSize;
                len-=actualSize;
            }
            split(i,beginPos,actualSize);
        }
    }

    public static void split(int i,int beginPos,int actualSize) throws IOException {
        RandomAccessFile raf=new RandomAccessFile(new File("DataStream"),"r");
        raf.seek(beginPos);
        byte[] flush=new byte[1024];
        int len=-1;
        while ((len=raf.read(flush))!=-1){
            if (actualSize>len){
                System.out.println(new String(flush,0,len));
                actualSize-=len;
            }else{
                System.out.println(new String(flush,0,actualSize));
                break;
            }
        }
        raf.close();
    }


}
