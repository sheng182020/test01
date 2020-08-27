package day11.Test01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test05 {
    public static void main(String[] args) {
        Calendar cal= Calendar.getInstance();
        cal.add(Calendar.DATE,5);
        int year=cal.get(Calendar.YEAR);
        int month=cal.get(Calendar.MONTH);
        int daye=cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+"月"+daye+"日");
    }

}
