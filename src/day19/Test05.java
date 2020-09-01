package day19;

import java.io.*;


public class Test05 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter outputStreamWriter=new OutputStreamWriter(new FileOutputStream("D:\\笔记.txt"),"gbk");
        outputStreamWriter.write("我爱java");
        outputStreamWriter.flush();
        outputStreamWriter.close();


    }
}
