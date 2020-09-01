package day17.Test01;

import java.io.File;

public class Test05 {
    public static void main(String[] args) {
        File file=new File("D:\\笔记.txt");
        file.delete();
        File f=new File("D:\\aaa");
        f.mkdir();
        f.delete();
    }
}
