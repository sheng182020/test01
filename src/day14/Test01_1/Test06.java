package day14.Test01_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test06 {
    public static void main(String[] args) {
        HashMap<String,Student> hashMap=new HashMap<>();
        hashMap.put("广东",new Student("晓明",18));
        hashMap.put("贵州",new Student("晓红",18));
        hashMap.put("广西",new Student("晓青",18));
        Set<String> keys=hashMap.keySet();
        for (String s : keys) {
            System.out.println(s+","+hashMap.get(s));
        }
        System.out.println();
        Set<Map.Entry<String,Student>> entrySet=hashMap.entrySet();
        Iterator<Map.Entry<String,Student>> en=entrySet.iterator();
        while (en.hasNext()){
            Map.Entry<String,Student> entry=en.next();
            System.out.println(entry.getKey()+entry.getValue());
        }
    }
}
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}