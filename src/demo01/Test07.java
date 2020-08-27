package demo01;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        System.out.println("请输入正三角形的边");
        Scanner in =new Scanner(System.in);
        int i=in.nextInt();
        int l=i-1;
        int t=1;
        for(int x=0;x<i;x++){
            for(int y=0;y<=l;y++){
                System.out.print("   ");

            }
            l--;

            for (int z=0;z<t;z++){
                System.out.print("*    ");
            }
            t++;
            System.out.print("\n");
        }
    }
}
