package day11.Test02;

import java.util.Calendar;

public class Test02 {
    public static void main(String[] args) {
        String str1 =new String("a");
        long start1=Calendar.getInstance().getTimeInMillis();
        for (int i = 0; i < 10000; i++) {
            str1=str1+"a";
        }
        long end1=Calendar.getInstance().getTimeInMillis();
        long time1=end1-start1;
        System.out.println("String time:"+time1+"ms");

        StringBuilder str2=new StringBuilder("a");
        long start2=Calendar.getInstance().getTimeInMillis();
        for (int i = 0; i < 10000; i++) {
            str2.append("a");
        }
        long end2=Calendar.getInstance().getTimeInMillis();
        long time2=end2-start2;
        System.out.println("StringBuilder time:"+time2+"ms");
    }
}
