package day10.Test02;


import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("小红"));
        list.add(new Student("小亮"));
        list.add(new Student("小明"));
        new className("java",new Teacher("张老师"),list).show();
        new Teacher().teaName(new Student("小红"),true);
        new Teacher().teaName(new Student("小亮"),true);
        new Teacher().teaName(new Student("小明"),false);

    }

}



