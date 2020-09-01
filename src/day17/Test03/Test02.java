package day17.Test03;

import java.io.File;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        String str=new Scanner(System.in).nextLine();
        File file=new File(str);
        removeFile(str);

    }
    public static void removeFile(String str){
//        String[] arr=str.split("\\\\");
        if(str.length()<3){
            return;
        }else{
            new File(str).delete();
            String s=str.substring(0,str.lastIndexOf("\\"));
            removeFile(s);
        }

    }
}
