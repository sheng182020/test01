package demo;

public class Test05 implements Runnable{
    int sum;

    public Test05(int sum) {
        this.sum = sum;
    }

    public Test05() {
    }

    public static void main(String[] args) {
        Thread t=new Thread(new Test05(5));
        t.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < sum; i++) {
            System.out.println(i);
        }
    }

//    @Override
//    public void run() {
//
//    }
}
