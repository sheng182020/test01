package day19;

import java.io.*;

public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(new FileOutputStream("D:\\d.txt"));
        bufferedOutputStream.write('c');
        bufferedOutputStream.close();
    }
}
