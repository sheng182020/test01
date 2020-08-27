package day16;

public class Test05 implements Runnable{

    public static void main(String[] args) {
        Thread t=new Thread(new Test05());
        t.start();
    }

//    @Override
//    public void run(int sum) {
//        for (int i = 0; i < sum; i++) {
//            System.out.println(i);
//        }
//    }
    /*
    * 因为继承父接口的Runnable是要重写run()方法，而不是重载run()方法，父接口Runnable的run()是没有参数的
    * 如果继承父接口添加了参数就会报错。
    * */

    @Override
    public void run() {

    }
}
