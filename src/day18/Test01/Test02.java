package day18.Test01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileO=new FileOutputStream("D:\\笔记.txt",true);
        byte[] buf={'a','c','b'};
        fileO.write(buf);
        int len;
        byte[] a=new byte[1024*2];
        FileInputStream fileI=new FileInputStream("D:\\笔记.txt");
        while((len=fileI.read(a))!=-1){
            System.out.println(new String(a,0,len));
        }
        fileI.close();
        fileO.close();
    }
}
