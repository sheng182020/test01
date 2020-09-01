package day19;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(new FileOutputStream("D:\\c.txt"));
        byte[] bytes=new byte[1024];
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.close();
    }
}
