package day18.Test03;

import java.io.*;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) throws IOException {
        String str=new Scanner(System.in).nextLine();
        File file=new File(str);
        getJava(file);
    }
    public static void getJava(File file) throws IOException {
        File[] files=file.listFiles();
        for (File f : files) {
            if(f.isFile()){
                if(f.getName().endsWith(".java")){
                    FileInputStream in=new FileInputStream(f.getPath());
                    FileOutputStream out=new FileOutputStream("D:\\java文件夹\\"+f.getName());
                    byte[] bytes=new byte[1024*2];
                    int len;
                    while ((len=in.read(bytes))!=-1){
                        System.out.println(1);
                        out.write(bytes,0,len);
                    }
                    in.close();
                    out.close();
                }
            }else if(f.isDirectory()){
                getJava(f);
            }
        }
    }
}
