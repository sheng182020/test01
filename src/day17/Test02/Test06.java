package day17.Test02;

import java.io.File;
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        String str=new Scanner(System.in).nextLine();
        File file=new File(str);
        file.mkdirs();
        System.out.println(calculate(file));
    }
    public static long calculate(File file){
        int size=0;
        File[] files=file.listFiles();
        for (File f : files) {
            if(f.isDirectory()){
                calculate(f);
            }else if(f.isFile()){
                size+=f.length();
            }
        }
        return size;
    }
}
