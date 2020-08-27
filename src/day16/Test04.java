package day16;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test04 {
//    static int num=1;
    public static void main(String[] args) {
        ExecutorService cached= Executors.newCachedThreadPool();
        cached.execute(new Runnable() {
            @Override
            public void run() {
                int a=10;
                int num=1;
                while(a>1){
                    num*=a;
                    a--;
                }
                System.out.println("10!  :"+num);
            }
        });
        cached.execute(new Runnable() {
            @Override
            public void run() {
                int a=5;
                int num=1;
                while(a>1){
                    num*=a;
                    a--;
                }
                System.out.println("5!  :"+num);
            }
        });
        cached.execute(new Runnable() {
            @Override
            public void run() {
                int a=8;
                int num=1;
                while(a>1){
                    num*=a;
                    a--;
                }
                System.out.println("8!  :"+num);
            }
        });
        cached.shutdown();
    }
}
