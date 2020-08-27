package day13.test02;

import java.util.HashSet;
import java.util.Iterator;

public class Test10 {
    public static void main(String[] args) {
        HashSet<Student1> hashSet=new HashSet<>();
        hashSet.add(new Student1("小明",17,60));
        hashSet.add(new Student1("小明",17,70));
        hashSet.add(new Student1("小明",17,80));
        hashSet.add(new Student1("小明",18,90));
        hashSet.add(new Student1("小明",17,50));
        Iterator<Student1> it=hashSet.iterator();
        Student1 stu=it.next();
        double num=0;
        double max=stu.getResult();
        double min=stu.getResult();
        for (Student1 s1 : hashSet) {
            num+=s1.getResult();
            if(s1.getResult()>max){
                max=s1.getResult();
            }
            if(s1.getResult()<min){
                min=s1.getResult();
            }
        }
        System.out.println("总分："+num);
        System.out.println("平均分："+num/hashSet.size());
        System.out.println("最高分："+max);
        System.out.println("最低分："+min);

    }
}
class Student1{
    private String name;
    private int age;
    private double result;

    public Student1(String name, int age, double result) {
        this.name = name;
        this.age = age;
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
