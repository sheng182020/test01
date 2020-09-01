package day19;

import java.io.*;

public class Test06 {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader=new InputStreamReader(new FileInputStream("D:\\笔记.txt"),"gbk");
        int len;
        char [] chars=new char[1024];
        while((len=inputStreamReader.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }
        inputStreamReader.close();
    }
}
