package day07;

public class Test01 {
    public static void main(String[] args) {
        String str1=new String("abcde");
        System.out.println(str1);
        char[] chs={'a','b','c','d','e'};
        String str2=new String (chs);
        System.out.println(str2);
        byte[] bytes={97,98,99,100,101};
        String str3=new String(bytes);
        System.out.println(str3);
    }
}
