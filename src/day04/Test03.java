package day04;

public class Test03 {
    public static void main(String[] args) {
        int length=20,width=8;
        int zc=getPerimeter(length,width);
        System.out.println("长方形的周长:"+zc);
        int area=getArea(length,width);
        System.out.println("长方形的面积："+area);
    }
    public static int getPerimeter(int length,int weidth){
        return (length+weidth)*2;
    }
    public static int getArea(int length,int weidth){
        return length*weidth;
    }
}
