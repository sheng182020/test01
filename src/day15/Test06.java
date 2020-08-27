package day15;

public class Test06 {
    static int c=1;
    static int a=0;
    static int b=0;
    public static void main(String[] args) {

        Object obj=new Object();
        new Thread(new Runnable() {

            @Override
            public void run() {
                while(true){
                    synchronized (obj){
                        if(c>100){
                            System.out.println("仓库没货了喔！");
                            break;
                        }
                        System.out.println(Thread.currentThread().getName()+"卖出了第"+c+"个杯子");
                        b++;
                        c++;
                    }
                }
                System.out.println("实体店卖了"+b);
            }
        },"实体店购买").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    synchronized (obj){
                        if(c>100){
                            System.out.println("仓库没货了喔！");
                            break;
                        }
                        System.out.println(Thread.currentThread().getName()+"卖出了第"+c+"个杯子");
                        a++;
                        c++;
                    }
                }
                System.out.println("网店卖了"+a);
            }
        },"网店购买").start();


    }
}
