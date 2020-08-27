package day17;

import java.io.File;

public class Test03 {
    public static void main(String[] args) {
        System.out.println("单级文件夹的创建"+new File("D:"+File.separator+"bbb").mkdir());

    }
}
