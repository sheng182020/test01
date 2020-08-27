package day14.Test03_2.Test02;

import java.util.Random;

public class MyThread extends Thread{
    public MyThread(String name){
        super();
    }

    @Override
    public void run() {
        int sum=0;
        for (int i = 0; i < 10; i++) {
            int a=new Random().nextInt(900)+100;
            sum+=a;
        }

        System.out.println(sum);
    }
}
