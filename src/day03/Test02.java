package day03;

public class Test02 {
    public static void main(String[] args) {
        getQ();
    }
    public static void getQ(){
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println("1-100的奇数累加和："+sum);
    }
}
