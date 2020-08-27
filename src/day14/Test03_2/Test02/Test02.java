package day14.Test03_2.Test02;

public class Test02 {
    public static void main(String[] args) {
        MyThread mt=new MyThread("新的线程");
//        mt.start();
        mt.run();
    }
}
