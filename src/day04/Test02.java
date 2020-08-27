package day04;

public class Test02 {
    public static void main(String[] args) {
        int a=Sum(20);
        System.out.println(a);
    }
    public static int Sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
}
