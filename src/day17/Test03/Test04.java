package day17.Test03;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        String str =new Scanner(System.in).nextLine();
        File file=new File(str);
        getNum(file);
    }
    public static void getNum(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                getNum(f);
            } else if (f.isFile()) {
//                String key = file.getName().substring(file.getName().lastIndexOf(".") + 1);
                System.out.println(f.getName());

            }

        }

    }
}
