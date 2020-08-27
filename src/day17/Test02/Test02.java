package day17.Test02;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) throws IOException {
        String str=new Scanner(System.in).nextLine();
        File file=new File(str);
        String end=str.substring(str.lastIndexOf("\\")+1);
        String start=str.substring(0,str.lastIndexOf("\\")-1);
        if(end.indexOf(".")!=-1){
            (new File(start)).mkdirs();
            file.createNewFile();
            System.out.println("文件大小："+new File(end).length());
        }else{
            file.mkdirs();
            File[] files=file.listFiles();
            for (File f : files) {
                if(f.isFile()){
                    System.out.println(f.getName());
                }
            }
        }

    }
}
