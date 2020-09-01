package day19;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new FileReader("D:\\Test.txt"));
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("D:\\Test1.txt",true));
        List<String> list=new ArrayList<>();
        String str=null;
        while((str=bufferedReader.readLine())!=null){
            list.add(str);
        }
        Collections.reverse(list);

        for (String s : list) {
            bufferedWriter.write(s);
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
