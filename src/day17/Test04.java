package day17;

import java.io.File;

public class Test04 {
    public static void main(String[] args) {
        System.out.println("多级文件夹的创建:"+new File("D:"+File.separator+"ccc"+File.separator+"bbb"+File.separator+"aaa").mkdirs());

    }
}
