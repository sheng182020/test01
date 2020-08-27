package day15;

public class Test07 {
    private static int num=80;
    public static void main(String[] args) {
        Object obj=new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    synchronized (obj){
                        if (num<1){
                            System.out.println("没位了");
                            break;
                        }
                        System.out.println(Thread.currentThread().getName()+"还剩"+(--num)+"座位");
                    }
                }
            }
        },"前门上车---").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    synchronized (obj){
                        if (num<1){
                            System.out.println("没位了");
                            break;
                        }
                        System.out.println(Thread.currentThread().getName()+"还剩"+(--num)+"座位");
                    }
                }
            }
        },"中门上车---").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    synchronized (obj){
                        if (num<1){
                            System.out.println("没位了");
                            break;
                        }
                        System.out.println(Thread.currentThread().getName()+"还剩"+(--num)+"座位");
                    }
                }
            }
        },"后门上车---").start();
    }
}

