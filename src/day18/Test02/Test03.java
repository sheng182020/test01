package day18.Test02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test03 {
    public static void main(String[] args) throws IOException {
        getNunber('a');
    }
    public static void getNunber(char a) throws IOException {
        FileInputStream in=new FileInputStream("D:\\Test.txt");
        int b=0;
        while(true){
            if(in.read()==a){
                b+=1;
            }else if(in.read()==-1){
                System.out.println(a+"出现了"+b+"次");
                break;
            }else {

            }
        }
        in.close();
    }
}
