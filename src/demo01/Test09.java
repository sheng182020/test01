package demo01;

public class Test09 {
    public static void main(String[] args) {
        for(int a=100;a<1000;a++){
            sum(a);
        }
    }
    public static void sum(int x){
        int a=x%10;
        int b=x/10%10;
        int c=x/100;
        if(a*a*a+b*b*b+c*c*c==x){
            System.out.println(x);
        }
    }
}
