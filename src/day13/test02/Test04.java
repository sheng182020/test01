package day13.test02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Test04 {
    public static void main(String[] args) {
        HashSet<Student> hashSet=new HashSet<>();
        hashSet.add(new Student("小明",11,"男"));
        hashSet.add(new Student("小明",12,"男"));
        hashSet.add(new Student("小小",13,"男"));
        hashSet.add(new Student("小明",15,"女"));
        hashSet.add(new Student("小明",15,"男"));
        hashSet.add(new Student("小明",16,"男"));
        hashSet.add(new Student("小明",17,"男"));
        hashSet.add(new Student("小明",18,"男"));
        hashSet.add(new Student("小明",19,"男"));
        hashSet.add(new Student("小明",11,"男"));
        Iterator<Student> integer=hashSet.iterator();
        while(integer.hasNext()){
            Student stu=integer.next();
            System.out.println(stu);
        }
        System.out.println();
        for (Student student : hashSet) {
            System.out.println(student);
        }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(sex, student.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
