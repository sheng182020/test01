package day03;

public class Test07 {
    public static void main(String[] args) {
        getR();
    }
    public static void getR(){
        int count=0;
        for(int i=1;i<=60;i++){
            if(i%2==0){
                System.out.print(i+"\t");
                ++count;
            }
            if(count%5==0){
                System.out.println();
            }
        }
    }
}
