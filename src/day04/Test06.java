package day04;

public class Test06 {
    public static void main(String[] args) {
        printX(10);
    }
    public static void printX(int x){
        int k=x-1;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
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
