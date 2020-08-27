package day04;

public class Test09 {
    public static void main(String[] args) {
        for(int y=1;y<=9;y++){
            for(int x=1;x<=y;x++){
                System.out.print(x+"*"+y+"="+ x*y+"\t");
            }
            System.out.println();
        }
    }
}
