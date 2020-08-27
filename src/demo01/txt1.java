package demo01;

public class txt1 {
    public static void main(String [] args){
//        System.out.println(5==2);
//        System.out.println(5==5);
//        System.out.println(5>2);
//        System.out.println(5>=2);
//        System.out.println(5<2);
//        System.out.println(5<=2);
//        System.out.println(5!=2);

        int x=11,y=10,z=16;
        getSum1(x,y,z);
        getSum2(x,y);
    }
    public static void getSum1(int a,int b,int c){
        int d=a>b?(a>c?a:c):(b>c?b:c);
        System.out.println(d);
    }
    public static void getSum2(int a,int b){
        System.out.println(a>b?a:b);
    }
}
