package day03;

public class Test09 {
    public static void main(String[] args) {
        int k=6;
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                if(i==j|k==j){
                    System.out.print("O ");
                }else{
                    System.out.print("* ");
                }
            }
            k--;
            System.out.println();
        }
    }
}
