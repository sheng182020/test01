package day17.Test02;

import java.io.File;
import java.io.FileFilter;

public class Test04 {
    public static void main(String[] args) {
        File file=new File("D:\\java\\demo\\src\\demo");
        System.out.println(new filed().accept(file));
        File[] files=file.listFiles();
        for (File f : files) {
            if (f.getName().endsWith(".java")){
                System.out.println(f.getName());

            }
        }
    }

}
class filed implements FileFilter{

    @Override
    public boolean accept(File pathname) {
        if (pathname.getName().endsWith(".java")){
            return true;
        }else{

            return false;
        }
    }
}

