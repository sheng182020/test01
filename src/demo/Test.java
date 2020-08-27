package demo;



public class Test {
    public static void main(String[] args) {
//        int x=1;
//        for(System.out.println("a");x<=3; System.out.println("c") ){   /*for(单次表达式;条件表达式;末尾循环体){中间循环体}*/
//            System.out.println("b");
//            x++;
//        }
//
//
//        int a=1;
//        for (int i=0;i<100;i++){
//            a=a++;
//        }
//        System.out.println(a);
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%3==0){
                continue;
            }
            sum+=i;
        }
        System.out.println(sum);


        for(int x=10;x<=20;x++){

            if(x%10==3){
                break;
            }
            System.out.println(x);

        }


        int a=0;
        test01(a);
        a=a++;//没有（a=）的时候输出 1
        System.out.println(a);

//        double p=1.0/0;
//        System.out.println(a);//infinity
        //0向上转型变成无穷小，任何一个数除以无穷小都会变成无穷大（微积分）
    }
    public static void test01(int a){
        a++;

    }
}
