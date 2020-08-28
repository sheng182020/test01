package day18.Test01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream("D:\\a.txt");
        fileOutputStream.write('c');

        System.out.println((char) new FileInputStream("D:\\a.txt").read());
    }
}
