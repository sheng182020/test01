package day03;

public class Test03 {
    public static void main(String[] args) {
        getW();
    }
    public static void getW(){
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%3==0&i%5==0){
                sum+=i;
                System.out.println(i);
            }
        }
    }
}
