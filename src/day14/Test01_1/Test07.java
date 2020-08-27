package day14.Test01_1;

import java.util.*;

public class Test07 {
    public static void main(String[] args) {
        HashMap<Student1, String> hashMap=new HashMap<>();
        hashMap.put(new Student1("晓明",18),"广东");
        hashMap.put(new Student1("晓青",18),"贵州");
        hashMap.put(new Student1("晓红",18),"广西");
        hashMap.put(new Student1("晓红",18),"广西");
        Set<Student1> keys=hashMap.keySet();
        for (Student1 s : keys) {
            System.out.println(s+hashMap.get(s));
        }
        System.out.println();
        Set<Map.Entry<Student1,String>> entrySet=hashMap.entrySet();
        Iterator<Map.Entry<Student1,String>> it=entrySet.iterator();
        while(it.hasNext()){
            Map.Entry<Student1,String> entry=it.next();
            System.out.println(entry.getKey()+entry.getValue());
        }

//        for (Map.Entry<Student1, String> entry : entrySet) {
//            System.out.println(entry.getKey()+entry.getValue());
//
//        }
    }
}
class Student1{
    private String name;
    private int age;

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student1 student1 = (Student1) o;
        return age == student1.age &&
                Objects.equals(name, student1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
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
