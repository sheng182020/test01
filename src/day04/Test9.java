package day04;

public class Test9 {
    public static void main(String[] args) {
        String[] num={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] color={"黑桃","红桃","梅花","方片"};
        for(String j:color){
            for (String i:num){
                System.out.print(j+i+"\t");
            }
            System.out.println();
        }
    }
}
