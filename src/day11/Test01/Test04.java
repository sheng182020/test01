package day11.Test01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test04 {
    public static void main(String[] args) throws ParseException {
        String str="2020-8-18";
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        Date date=df.parse(str);
        System.out.println(date);
    }
}
