package day10.Test01;

public class Test01 {
    public static void main(String[] args) {
        String num="23.23456789";
        new HandleAble(){
            @Override
            public void HandleString(String num){
//                int n = Integer.parseInt(num);
//                int n=Integer.valueOf(num).intValue();
                float n=Float.parseFloat(num);
                int m=(int)n;
                System.out.println("原数据:"+num);
                System.out.println("取整后："+m);
                System.out.println("保留4位小数后："+(float)Math.round(n*10000)/10000);
            }
        }.HandleString(num);
    }
}
