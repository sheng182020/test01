package day17;

import java.io.File;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) throws IOException {
        File myFile=new File("D:\\a.txt");
        System.out.println("创建文件前是否存在："+myFile.exists());
        if (!myFile.exists()){
            myFile.createNewFile();
            System.out.println("创建文件后是否存在："+myFile.exists());
        }
    }
}
