package day15.Test03;

public class Runnable implements java.lang.Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Runnable子线程");
        }
    }
}
