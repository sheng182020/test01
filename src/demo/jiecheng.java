package demo;

public class jiecheng {
    public static void main(String[] args) {
        int s=1;
        for(int i=1;i<=8;i++){
            s*=i;
        }
        System.out.println(s);

        int y=8;
        int sum=1;
        while(y>=1){
            sum*=y;
            y--;
        }
        System.out.println(sum);//while循环


        System.out.println(getSum(8));
    }
    public static int getSum(int x){
        if(x==1){
            return x;
        }
        return x*getSum(x-1);
    }
}
