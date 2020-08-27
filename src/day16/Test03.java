package day16;

import java.util.Random;
import java.util.concurrent.*;

public class Test03 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Callable<Integer> callable=new Callable<Integer>(){
            @Override
            public Integer call() throws Exception {
                int sum=0;
                for (int i = 0; i < 10; i++) {
                    int num=new Random().nextInt(100)+1;
                    sum+=num;
                }
                sum/=10;
                return sum;
            }
        };
        int sum=0;


        for (int i = 0; i < 3; i++) {
            ExecutorService fixed= Executors.newFixedThreadPool(3);
            FutureTask<Integer> futureTask=new FutureTask<>(callable);
            fixed.execute(futureTask);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sum+=futureTask.get();
            System.out.println("线程："+futureTask.get());
            fixed.shutdown();
        }

        System.out.println("平均数的平均数："+sum/3);

    }
}
