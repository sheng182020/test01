package day04;

public class Test4 {
    public static void main(String[] args) {
        int[] arr={1,8,10,12,18,28,12};
        printBall(arr);
    }
    public static void printBall(int[] array){
        System.out.println("您的双色球号为：");
        for(int i:array){
            System.out.print(i+"\t");
        }
    }
}
