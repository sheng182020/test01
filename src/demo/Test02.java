package demo;

import java.util.ArrayList;
import java.util.Random;

public class Test02 {
    public static void main(String[] args) {
        Object obj=new Object();
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    synchronized (obj){
                        System.out.print("犯");
                        System.out.print("我");
                        System.out.print("中");
                        System.out.print("华");
                        System.out.print("者");
                        System.out.println();
                    }
                }
            }
        }.start();
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                synchronized (obj){
                    System.out.print("虽");
                    System.out.print("远");
                    System.out.print("必");
                    System.out.print("诛");
                    System.out.println();
                }
            }
        }).start();
    }
}
class Shower{
    int count=1;
    Object obj =new Object();
    public synchronized void show(){
        System.out.print("犯");
        System.out.print("我");
        System.out.print("中");
        System.out.print("华");
        System.out.print("者");
        System.out.println();
    }
}


