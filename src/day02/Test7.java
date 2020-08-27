package day02;

public class Test7 {
    public static void main(String[] args) {
        int x=100,y=200;
        add(x,y);
        sub(x,y);
        mul(x,y);
        div(x,y);
        remain(x,y);
    }
    public static void add(int a,int b){
        int c=a+b;
        System.out.println("x,y的和为："+c);
    }
    public static void sub(int a,int b){
        int c=a-b;
        System.out.println("x,y的差为："+c);
    }
    public static void mul(int a,int b){
        int c=a*b;
        System.out.println("x,y的积为："+c);
    }
    public static void div(int a,int b){
        int c=a/b;
        System.out.println("x,y的商为："+c);
    }
    public static void remain(int a,int b){
        int c=a%b;
        System.out.println("x,y的余数为："+c);
    }
}
