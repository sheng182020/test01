package day19;


import sun.applet.Main;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) throws IOException, URISyntaxException {
        FileReader fileReader=new FileReader(String.valueOf("D:\\笔记.txt"));
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("D:\\b.txt"));
        String line=null;
        while((line=bufferedReader.readLine())!=null){
            bufferedWriter.write(line);
            System.out.println(line);
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();


    }
}
