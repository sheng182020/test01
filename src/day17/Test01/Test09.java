package day17.Test01;

public class Test09 {
    public static void main(String[] args) {
        System.out.println(getSum(100));
    }
    public static int getSum(int n){
        if(n>1){
            return getSum(n-1)+n;
        }else{
            return 1;
        }
    }

}
