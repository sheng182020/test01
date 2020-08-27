package day15;

public class Test08 {
    public static void main(String[] args) {
        new MyThread("a窗口").start();
        new MyThread("b窗口").start();
        new MyThread("c窗口").start();
        new MyThread("d窗口").start();

    }
}
class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }
    Object obj=new Object();
    private static int a=20;
    @Override
    public synchronized void run() {
        while(true){
            synchronized (obj){
                if(a<0){
                    break;
                }
                System.out.println(Thread.currentThread().getName()+"卖了一张票，剩余票数为："+a--);
            }
        }
    }
}
