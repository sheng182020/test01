package demo01;

public class Test04 {
    public static void main(String[] args) {
//        int [] a= {'α','β','γ','δ','ε','ζ','η','θ','ι','κ','λ','μ','ν','ξ','ο','π','ρ','σ','τ','υ','φ','χ','ψ','ω'};
//        for(int i:a) {
//            System.out.println(i);
//        }
        int startPosition=945;
        int endPosition=969;
//        char cStart='α',cEnd='ω';
//        startPosition= cStart;   //cStart做int型转换，并将结果赋值给startPosition
//        endPosition= cEnd;      //cEnd做int型转换，并将结果赋值给endPosition
        System.out.println("希腊字母表：");
        for(int i=startPosition;i<=endPosition;i++)
        {
            char c;
            c=(char)i;//i做char型转换运算，并将结果赋值给c
            System.out.print(" "+c);//输出希腊字母空格分开
        }
    }
}
