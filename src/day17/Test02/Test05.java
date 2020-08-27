package day17.Test02;

import java.io.File;
import java.io.FileFilter;
import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        String str=new Scanner(System.in).nextLine();
        File file=new File(str);
        file.mkdirs();
        dir(file);
    }
    public static void dir(File pathname){
        File[] files=pathname.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });
        for (File f : files) {
            f.delete();
        }
        pathname.delete();
    }
}
