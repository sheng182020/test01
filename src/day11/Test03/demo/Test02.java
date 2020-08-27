package day11.Test03.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        System.out.println("\t\t\t欢迎使用超市购物系统");
        sys s=new sys();
        s.dity();
        s.systemShow();
        int y=new Scanner(System.in).nextInt();
        s.printA(y);
    }

}



