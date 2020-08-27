package day16.Test07;



public class TestInvokeCalc {
    public static void main(String[] args) {
        invokeCals(130,120,(int a,int b)->{
            return a-b;
        });

        invokeCals(130,120,(a,b)->
            a-b
        );
    }
    private static void invokeCals(int a, int b, Calculator calculator){
        int result=calculator.calc(a,b);
        System.out.println("结果是："+result);
    }
}
