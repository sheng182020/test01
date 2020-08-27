package day16.Test08;

import java.util.*;

public class Test08 {
    public static void main(String[] args) {
        List<Student> list= Arrays.asList(
                new Student("张三",85),
                new Student("李四",55),
                new Student("王五",90),
                new Student("刘六",65)
        );
        Collections.sort(list,(a,b)->a.getScore()-b.getScore());
        System.out.println(list);
    }
}
