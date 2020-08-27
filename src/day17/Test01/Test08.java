package day17.Test01;

import java.io.File;

public class Test08 {
    public static void main(String[] args) {
        File file=new File("D:\\aaa");
        getFileName(file);

    }
    public static void getFileName(File file){
        if(file.exists()){
            File[] files=file.listFiles();
            for (File f : files) {
                if(f.isFile()){
                    System.out.println(f.getName());
                }
            }
        }else{
            System.out.println("null");
        }

    }
}
