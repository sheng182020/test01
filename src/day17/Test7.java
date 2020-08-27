package day17;

import java.io.File;
import java.io.IOException;

public class Test7 {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\aaa");
        File f=new File("D:\\a.txt");
        if(!file.exists()){
            file.mkdir();
            new File(file+"\\a.txt").createNewFile();
        }else{
            new File(file+"\\a.txt").createNewFile();
        }




    }
}
