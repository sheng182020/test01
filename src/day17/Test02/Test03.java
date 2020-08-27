package day17.Test02;

import java.io.File;

public class Test03 {
    public static void main(String[] args) {
        File file=new File("D:\\aaa\\aa\\a");
        getFileName(file);

    }
    public static void getFileName(File file){
        if(file.exists()){
            File[] files=file.listFiles();
            for (File f : files) {
                if(f.isFile()){
                    System.out.println(f.getName());
                }else{
                    getFileName(f);
                }
            }
        }else{
            System.out.println("null");
        }

    }
}
