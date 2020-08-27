package day17.Test03;

import java.io.File;

public class Test01 {
    public static void main(String[] args) {
        File file=new File("D:\\java\\demo");
        getFile(file);
    }
    public static void getFile(File file){
        File[] files=file.listFiles();
        for (File f : files) {
            if (f.isDirectory()){
                getFile(f);
            }else if(f.isFile()) {
                if(f.length()<200000){
                    System.out.println(f.getName());
                }
            }
        }
    }
}
