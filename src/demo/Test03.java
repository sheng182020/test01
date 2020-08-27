package demo;

import java.util.*;

public class Test03 {
    public static void main(String[] args) {
        MyThread m=new MyThread("广州南");
        m.start();
        Thread mt=new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        Thread mc=new Thread(()->{
            System.out.println("Lamboo");
        });

        MyRun myRun=new MyRun();
        Thread t=new Thread(myRun,"东站");
        t.start();

        new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        },"西站").start();
    }

}
class MyThread extends Thread{
    public MyThread(Runnable target) {
        super(target);
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i+","+Thread.currentThread().getName());
        }
        eat();
    }
    public void eat(){
        System.out.println("吃东西");
    }
}
class MyRun implements  Runnable{
    @Override
    public void run() {

    }
}


