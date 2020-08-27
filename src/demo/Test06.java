package demo;

import java.io.File;
import java.io.IOException;

public class Test06 {
    public static void main(String[] args) throws IOException {
//        File myFile = new File("D:" + File.separator + "Download" + File.separator, "test.txt");
////        File myFile = new File("D:" + File.separator,"test.txt");
//        File f=new File("D:\\Download","Test.txt");
//        System.out.println(myFile.exists());
//        System.out.println(myFile.createNewFile());
//        System.out.println(f.exists());
////        System.out.println(f.delete());

//        System.out.println(new File("Paim\\demo").mkdirs());
//        System.out.println(new File("Paim").delete());
//        String[] arr=new File("D:\\360Downloads\\te\\d").list();
//        File[] arr=new File("D:\\360Downloads\\te\\d").listFiles();
//        for (File s : arr) {
//            System.out.println(s);
//        }
        File file=new File("D:\\CCC","b.txt");
        file.mkdirs();
        if(!file.exists()){
            file.createNewFile();
        }
    }
}
