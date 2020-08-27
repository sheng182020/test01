package day13.test03;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;

public class Test02 {
    public static void main(String[] args) {
        HashSet<Student> hashSetclass1=new HashSet<>();
        hashSetclass1.add(new Student("小明",18));
        hashSetclass1.add(new Student("小红",18));
        hashSetclass1.add(new Student("小明",18));
        hashSetclass1.add(new Student("小明",81));

        HashSet<Student> hashSetclass2=new HashSet<>();
        hashSetclass2.add(new Student("小红",18));
        hashSetclass2.add(new Student("小亮",18));
        hashSetclass2.add(new Student("小花",18));
        hashSetclass2.add(new Student("小龚",81));

        HashSet<HashSet> hs=new HashSet<>();
        hs.add(hashSetclass1);
        hs.add(hashSetclass2);

        System.out.println(hs);
    }
}
class Student implements Comparable<Student>{
    private String name;
    private int age;

    @Override
    public int compareTo(Student o) {
        return this.age-o.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
}
