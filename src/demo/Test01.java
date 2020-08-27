package demo;

import java.rmi.StubNotFoundException;
import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("龚磊", 2, "男");
        Student s2 = new Student("曹鑫", 1, "男");
        Student s3 = new Student("夏国斌", 3, "男");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        int index=0;
        for (int i = 0; i < list.size(); i++) {
            Student stu = (Student) list.get(1);
            if (list.get(i).getAge() > stu.getAge()) {
                stu = (Student) list.get(i);
                index=i;
            }
        }
        System.out.println(list.get(index).getName()+"\t"+list.get(index).getAge()+"\t"+list.get(index).getSex());
        list.get(index).setName("小魔仙");
        System.out.println(list.get(index).getName()+"\t"+list.get(index).getAge()+"\t"+list.get(index).getSex());


    }
}
class Student{
    private String name;
    private int age;
    private String sex;

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
