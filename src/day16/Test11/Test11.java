package day16.Test11;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test11 {
    static int p=0;

    public static void main(String[] args) {
        Object obj=new Object();
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("前门");
                int a=0;
                while(p<100){
                    synchronized (obj){
                        try {
//                    TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
                            ++p;
                            a++;
                            System.out.println("编号为："+p+"的员工 从"+Thread.currentThread().getName()+"入场！  拿到的双色球彩票号码是："+create());
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                System.out.println("从前门进场的员工总共有"+a+"位员工");
            }
        });
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("后门");
                int b=0;
                while (p<100){
                    synchronized (obj){
                        try {
                            ++p;
                            b++;
                            System.out.println("编号为："+p+"的员工 从"+Thread.currentThread().getName()+"入场！  拿到的双色球彩票号码是："+create());
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                System.out.println("从后门进场的员工总共有"+b+"位员工");
            }
        });
        executorService.shutdown();
    }


    public static String create(){
        String[] red=new String[33];
        for (int i = 1; i <=33; i++) {
            red[i-1]=String.valueOf(i);
        }
        String[] blue="01,02,03,04,05,06,07,08,09,10,11,12,13,14,15,16".split(",");
        boolean[] used=new boolean[red.length];
        Random r=new Random();
        String[] all=new String[7];
        for (int i = 0; i < 6; i++) {
            int idx;
            do {
                idx=r.nextInt(red.length);
            }while (used[idx]);
            used[idx]=true;
            all[i]=red[idx];
        }
        all[all.length-1]=blue[r.nextInt(blue.length)];
        Arrays.sort(all);
        return Arrays.toString(all);
    }

}
