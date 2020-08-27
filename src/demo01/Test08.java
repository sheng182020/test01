package demo01;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        int i=in.nextInt();
        add();
        sub();


    }
    public static void add() {
        int d=1;
        for(int a=0;a<5;a++){
            for(int b=5;b>d;b--){
                System.out.print(" ");
            }
            for (int c=0;c<d;c++){
                System.out.print("* ");
            }
            System.out.print("\n");
            d++;
        }
    }
    public static void sub() {
        int d=1;
        for(int a=0;a<5;a++){
            for(int b=0;b<d;b++){
                System.out.print(" ");
            }
            for (int c=5;c>d;c--){
                System.out.print("* ");
            }
            d++;
            System.out.println();
        }
    }

    }
