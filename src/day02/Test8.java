package day02;

public class Test8 {
    public static void main(String[] args) {
        char ch='J';
        ch=Character.toLowerCase(ch);
        System.out.println(ch);

        char ch2='a';
        ch2-=32;
        System.out.println(ch2);

        double d3=3.5;
        int i3=100;
        double sum3=d3+(int)i3;
        System.out.println("sum3的值："+sum3);
        System.out.println("sum3的整数部分："+(int)sum3);

        double d4=50.1;
        int i4=7;
        int mul4=(int)(d4*i4);
        System.out.println("mul的整数部分"+mul4);
    }
}
