package demo01;
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        System.out.println("请输入直角三角形的边");
        Scanner in =new Scanner(System.in);
        int i=in.nextInt();
        int l=0;
        for(int x=0;x<=i;x++){
            for(int y=0;y<=l;y++){
                System.out.print("*\t");
            }
            System.out.print("\n");
            l++;
        }
    }
}
