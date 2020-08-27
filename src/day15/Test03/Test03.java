package day15.Test03;

public class Test03 {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程");
        }

        Runnable runnable=new Runnable();
        new Thread(runnable).start();

    }
}

