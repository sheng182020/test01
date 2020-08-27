package day17;

import java.io.File;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {
        File myFile=new File("D:\\Download\\Test.txt");
        myFile.createNewFile();
        System.out.println(myFile.exists());

        File f=new File("D:\\Download","Txt.txt");
        f.createNewFile();
        System.out.println(f.exists());
    }
}
