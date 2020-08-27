package day07;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        String str="javajfiewjavajfiowfjavakjjava";
        System.out.println(str+"字符串中java的数量：\t"+getCount(str,"java"));
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个长字符串：");
        String s1=sc.nextLine();
        System.out.println("请输入一个要查找的短字符串：");
        String s2=sc.nextLine();
        System.out.println(s1+"字符串中"+s2+"出现的次数是：\t"+getCount(s1,s2));

    }
    public static int getCount(String str,String ch){
        int count=0;
        int index=str.indexOf(ch);
        while(index!=-1){
            ++count;
            str=str.substring(index+ch.length());
            index=str.indexOf(ch);
        }
        return count;
    }
}
