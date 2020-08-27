package day15;

import java.util.*;

public class Test05 {
    private static int time=0;
    public static void main(String[] args) throws InterruptedException{
        String[] arr=new String[10];
        for(int i=0;i<10;i++){
            int r=new Random().nextInt(100)+1;
            arr[i]="曹鑫"+r+"号";
        }
        Object object=new Object();
        Runnable r=new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object){
                    System.out.println(Thread.currentThread().getName()+"第"+time/1000+"秒过山洞了");
                    time+=5000;

                }

            }
        };
        new Thread(r,arr[0]).start();
        new Thread(r,arr[1]).start();
        new Thread(r,arr[2]).start();
        new Thread(r,arr[3]).start();
        new Thread(r,arr[4]).start();
        new Thread(r,arr[5]).start();
        new Thread(r,arr[6]).start();
        new Thread(r,arr[7]).start();
        new Thread(r,arr[8]).start();
        new Thread(r,arr[9]).start();
    }

}
