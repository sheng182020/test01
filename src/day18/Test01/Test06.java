package day18.Test01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test06 {
    public static void main(String[] args) throws IOException {
        FileInputStream in=new FileInputStream("D:\\a.png");
        FileOutputStream out=new FileOutputStream("D:\\aa\\a.png");
        int len;
        while((len=in.read())!=-1){
            out.write(len);
        }
        in.close();
        out.close();
    }
}
