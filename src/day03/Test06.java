package day03;

public class Test06 {
    public static void main(String[] args) {
        getE();
    }
    public static void getE(){
        for(int i=100;i<1000;i++){
            int a=i%10;
            int b=i/10%10;
            int c=i/100;
            if(a*a*a+b*b*b+c*c*c==i){
                System.out.println(i);
            }
        }
    }
}
