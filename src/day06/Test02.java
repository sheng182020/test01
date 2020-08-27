package day06;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        System.out.println("请输入第一个数据：");
        Scanner in1=new Scanner(System.in);
        int a=in1.nextInt();
        System.out.println("请输入第二个数据：");
        Scanner in2=new Scanner(System.in);
        int b=in2.nextInt();
        System.out.println("请输入第三个数据：");
        Scanner in3=new Scanner(System.in);
        int c=in3.nextInt();
        int temp=a>b?a:b;
        int max=temp>c?temp:c;
        System.out.println("三个数的最大值："+max );
    }
}
