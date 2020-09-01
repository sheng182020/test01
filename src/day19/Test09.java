package day19;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Test09 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps=new PrintStream("D:\\笔记.txt");
        System.setOut(ps);
        System.out.println("曹鑫");
        ps.close();
    }
}
