package day04;

public class Test8 {
    public static void main(String[] args) {
        String[] result={"A","D","B","C","D"};
        String[] resultA={"D","C","B","A","D"};
        String[] resultB={"A","D","B","C","D"};
        String[] resultC={"A","D","B","C","A"};
        String[] resultD={"A","B","C","D","D"};
        System.out.println("满分10分，小明：得分"+getResult(result,resultA)+"分");
        System.out.println("满分10分，小红：得分"+getResult(result,resultB)+"分");
        System.out.println("满分10分，小黄：得分"+getResult(result,resultC)+"分");
        System.out.println("满分10分，小强：得分"+getResult(result,resultD)+"分");
    }
    public static int getResult(String[] x,String[] y){
        int result=0;
        for(int i=0;i<x.length;i++){
            if(x[i]==y[i]){
                ++result;
            }
        }
        return result*2;
    }
}
