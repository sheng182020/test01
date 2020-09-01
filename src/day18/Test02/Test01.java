package day18.Test02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入学生信息：学号-学生名字");
        while(true){
            String str=new Scanner(System.in).nextLine()+"\r\n";
            if (str.indexOf("end")!=-1){
                break;
            }
            byte[] bytes=str.getBytes();
            FileOutputStream out =new FileOutputStream("D:\\stu.txt",true);
            out.write(bytes);
        }

    }
}
