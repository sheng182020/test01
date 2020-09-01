package day18.Test02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Test04 {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        properties.load(new FileInputStream("D:\\score.txt"));

        Set<String> Strs=properties.stringPropertyNames();
        for (String str : Strs) {
            if(str.equals("lisi")){
                System.out.println("1");
                properties.setProperty(str,"100");
            }
        }
        properties.store(new FileWriter("D:\\score.txt"),"");


    }
}
