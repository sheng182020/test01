package day17.Test01;

import java.io.File;
import java.io.IOException;

public class Test07 {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\aaa");
        File f=new File("D:\\笔记.txt");
        if(!file.exists()){
            System.out.println("aaa是一个文件夹");
        }else{
            System.out.println("aaa是一个文件夹");
        }
        if(!f.exists()){
            System.out.println("a是一个文件");
        }else{
            System.out.println("a是一个文件");
        }




    }
}
