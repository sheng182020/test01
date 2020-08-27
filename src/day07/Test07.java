package day07;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        System.out.println("请输入一个QQ号码：");
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        System.out.println("这个QQ号码是否正确："+checkQQ(str1));
        String str2=sc.next();
        System.out.println("这个QQ号码是否正确："+checkQQ(str2));
    }
    public static boolean checkQQ(String qq) {
        char[] chs = qq.toCharArray();
        for (Object o : chs) {
            System.out.print((char) o>57);
            if ((char) o > 57 | (char) o < 48) {
                return false;
            }
        }
        if (qq.substring(0, 1) != "0" & qq.length() <=12 & qq.length() > 5) {
            return true;
        }else {
            return false;
        }


    }

}
