package day12.Tset02.test05;

import java.util.ArrayList;
import java.util.Iterator;

public class Test05 {
    public static void main(String[] args) {
        ArrayList<Person> list=new ArrayList<Person>();
        list.add(new Person("小明",18,1.9));
        list.add(new Person("小亮",20,1.5));
        list.add(new Person("小红",17,1.6));
        list.add(new Person("小黑",19,1.7));
        list.add(new Person("小白",16,1.8));
        Iterator<Person> it=list.iterator();
        while(it.hasNext()){
            Person p=it.next();
            p.setAge(p.getAge()+2);
        }
        for (Person p:list) {
            System.out.println(p.getAge()+"岁"+p.getName()+"身高"+p.getHeight());
        }
    }
}
class Person{
    private String name;
    private int age;
    private double height;

    public Person() {
    }

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
