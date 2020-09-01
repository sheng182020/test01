package day18.Test01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream("D:\\笔记.txt");
        fileOutputStream.write('c');

        System.out.println((char) new FileInputStream("D:\\笔记.txt").read());
        fileOutputStream.close();
    }
}
