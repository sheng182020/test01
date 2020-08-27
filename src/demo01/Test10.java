package demo01;

import java.util.Random;
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Random x= new Random();
        int temp = x.nextInt(1000)+1;
//        System.out.println(temp);
        while (true){
            System.out.println("请输入0~1000的数字：");
            System.out.println("输入0会退出游戏");
            Scanner scanner=new Scanner(System.in);
            int i=scanner.nextInt();
            if(i==0){
                break;
            }else if(i>temp){
                System.out.println("你猜大了！");
                System.out.println();
                continue;
            }else if(i==temp){
                System.out.println("你猜对了！");
                break;
            }else{
                System.out.println("你猜小了！");
                System.out.println();
                continue;
            }

        }
    }
}
