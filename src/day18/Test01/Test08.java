package day18.Test01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) throws IOException {
        String str = null;
        while(true){
            String s=new Scanner(System.in).nextLine();
            if(s.indexOf("886")!=-1){
                break;
            }
            str=s+str;
        }
        FileOutputStream out=new FileOutputStream("D:\\info.txt");
        byte[] bytes=str.getBytes();
        out.write(bytes);
        out.close();
    }
}
