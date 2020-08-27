package day17.Test02;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) throws IOException {
        String str=new Scanner(System.in).nextLine();
        File file=new File(str);
        if(!file.exists()){
            file.mkdirs();
            file.createNewFile();
            System.out.println("创建成功！");
        }else{
            System.out.println(file.length());
        }
    }
}
