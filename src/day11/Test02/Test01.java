package day11.Test02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入出生日期：（格式：YYYY-MM-dd）");
        String birthdayStr=new Scanner(System.in).next();
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate=df.parse(birthdayStr);
        long birDay=birthdayDate.getTime();
        Calendar cal=Calendar.getInstance();
        long nowDay=cal.getTimeInMillis();
        long sday=(nowDay-birDay)/(24*3600*1000);
        System.out.println(sday);

    }
}
