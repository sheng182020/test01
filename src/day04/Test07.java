package day04;

public class Test07 {
    public static void main(String[] args) {
        System.out.println("10.1 ->"+ round(10.1f));
        System.out.println("10.4 ->"+ round(10.4f));
        System.out.println("10.5 ->"+ round(10.5f));
        System.out.println("10.9 ->"+ round(10.9f));
    }
    public static int round(float x){
        return (int)(x+0.5f);
    }
}
