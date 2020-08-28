package day18.Test01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test07 {
    public static void main(String[] args) throws IOException {
        FileInputStream in=new FileInputStream("D:\\a.png");
        FileOutputStream out=new FileOutputStream("D:\\aa\\a.png");
        byte[] bytes=new byte[1024*2];
        int len;
        while((len=in.read())!=-1){
            out.write(bytes,0,len);
        }
        in.close();
        out.close();
    }
}
