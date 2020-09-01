package day18.Test02;

import sun.java2d.windows.GDIRenderer;

import java.io.*;

public class Test02 {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\d1");
        getFilepath(file);

    }
    public static void getFilepath(File file) throws IOException {
        if(file.isDirectory()){
            File[] files= file.listFiles();
            for (File f : files) {
                if (f.isFile()){
                    FileInputStream in=new FileInputStream(f.getPath());
                    FileOutputStream out=new FileOutputStream("D:\\d2\\"+f.getName());
                    byte[] bytes=new byte[1024*2];
                    int len;
                    while((len=in.read(bytes))!=-1){
                        out.write(bytes,0,len);
                    }
                    in.close();
                    out.close();
                }else if(f.isDirectory()){
                    getFilepath(f);
                }
            }
        }else if(file.isFile()){
            FileInputStream in=new FileInputStream(file.getPath());
            FileOutputStream out=new FileOutputStream("D:\\d2\\"+file.getName());
            byte[] bytes=new byte[1024*2];
            int len;
            while((len=in.read(bytes))!=-1){
                out.write(bytes,0,len);
            }
            in.close();
            out.close();
        }
    }
}
