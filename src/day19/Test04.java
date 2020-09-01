package day19;

import java.io.*;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("D:\\data.txt"));
        for (int i = 0; i < 3; i++) {
            String str=new Scanner(System.in).nextLine();
            bufferedWriter.write(str);
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();

        String str=new Scanner(System.in).nextLine();
        BufferedReader bufferedReader=new BufferedReader(new FileReader("D:\\data.txt"));
        boolean flag=false;
        String line=null;
        while((line=bufferedReader.readLine())!=null){
            if(line.equals(str)){
                flag=true;
            }
        }
        bufferedReader.close();
        System.out.println(flag?"验证成功":"验证失败");
    }
}
