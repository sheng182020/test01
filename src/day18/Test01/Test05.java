package day18.Test01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test05 {
    public static void main(String[] args) throws IOException {
        FileOutputStream out=new FileOutputStream("D:\\笔记.txt",true);
        byte[] bytes="i love java\r\n".getBytes();
        out.write(bytes);
        FileInputStream in=new FileInputStream("D:\\笔记.txt");
        int len;
        byte[] bs=new byte[1024*3];
        while((len=in.read())!=-1){
            System.out.print((char) len);
        }
        out.close();
        in.close();
    }
}
