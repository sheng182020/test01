package day15;

public class Test09 {
    public static void main(String[] args) {
        Factorial f=new Factorial();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+f.factorial(10));;
            }
        },"10!阶乘：").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+f.factorial(5));;
            }
        },"5!阶乘：").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+f.factorial(8));;
            }
        },"8!阶乘：").start();
    }
}
class Factorial{
    public int factorial(int a){
        if (a==1){
            return 1;
        }else{
            return factorial(a-1)*a;
        }
    }
}
