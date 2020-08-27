package day04;

public class Test08 {
    public static void main(String[] args) {
        System.out.println("摄氏度为：30.0\u00B0\u2013\u2013华氏度为："+getHua(30.0f)+"\u00B0");
        System.out.println("华氏度为：86.0\u00B0\u2013\u2013摄氏度为："+getShe(86.0f)+"\u00B0");
    }
    public static float getShe(float x){
        return (x-32)/9.0f*5;
    }
    public static float getHua(float y){
        return (9.0f/5)*y+32;
    }
}
