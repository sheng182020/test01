package day17.Test03;

import java.io.File;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
//        String str=new Scanner(System.in).nextLine();
        File file=new File("D:\\aa\\ll\\pp");
        String str="D:\\aa\\ll\\pp";
        removeFile(str);

    }
    public static void removeFile(String str){
        String[] arr=str.split("\\\\");

        String s=null;
        String start=str.substring(0,str.lastIndexOf("\\")-1);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                str+=arr[j]+"\\\\";
            }
            System.out.println(str);
            new File(str).delete();
        }

    }
}
