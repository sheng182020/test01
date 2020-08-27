package day13.test02;

import java.util.HashSet;
import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<>();
        boolean flag=true;
        int sum=0;
        while(flag){
            Scanner scanner=new Scanner(System.in);
            int sc=scanner.nextInt();
            if(sc==-1){
                flag=false;
            }else {
                hashSet.add(sc);
                sum+=sc;
            }
        }
        System.out.println(hashSet);
        System.out.println("求和："+sum);
        System.out.println("平均值："+sum/hashSet.size());
    }
}
