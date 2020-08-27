package day11.Test03;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入一个日期：（yyyy-MM-dd）");
        String dateStr= new Scanner(System.in).next();
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        Date date=df.parse(dateStr);
        System.out.println(date);
        df.applyPattern("yyyy年MM月dd日");
        String str=df.format(date);
        System.out.println(str);
    }
}
