package day03;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        System.out.println("请输入成绩：");
        Scanner in=new Scanner(System.in);
        int i=in.nextInt();
        getScode(i);

    }
    public static void getScode(int i){
        if(i<0|i>100){
            System.out.println("成绩有误！");
        }else if(i<=100&i>=90){
            System.out.println("成绩优秀！");
        }else if(i<90&i>=80){
            System.out.println("成绩好！");
        }else if(i<80&i>=70){
            System.out.println("成绩良！");
        }else if(i<70&i>=60){
            System.out.println("成绩及格！");
        }else if(i<60&i>=0){
            System.out.println("成绩不及格！");
        }
    }
}
