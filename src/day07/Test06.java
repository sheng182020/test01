package day07;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str=sc.nextLine();
        String[] arr={"奥巴马","美国","龚磊"};
        for(Object o:arr){
            if(str.indexOf((String)o)!=-1){
                str=str.replace((String)o,"*" );
            }
        }
        System.out.println(str);
    }
}
