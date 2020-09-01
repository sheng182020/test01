package day19;

import java.io.*;

public class Test03 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bufferedInputStream=new BufferedInputStream(new FileInputStream("D:\\a.png"));
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(new FileOutputStream("D:\\a\\a.png"));
        byte[] bytes=new byte[1024];
        int len;
        while ((len=bufferedInputStream.read(bytes))!=-1){
            bufferedOutputStream.write(bytes,0,len);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
