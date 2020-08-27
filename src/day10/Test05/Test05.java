package day10.Test05;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        System.out.print("选择：");
        Scanner cs=new Scanner(System.in);
        String str1=cs.next();
        new Player().select(str1).specialFight();
        new Player().select(str1).commonFight();
        System.out.println("===============");
        System.out.print("选择：");
        String str2=cs.next();
        new Player().select(str2).specialFight();
        new Player().select(str2).commonFight();

    }
}
