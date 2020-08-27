package day08.Test02;

public class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
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

    public void eat(){
        System.out.println(getName()+"吃饭");
    }
    public void sleep(){
        System.out.println(getName()+"睡觉");
    }
    public void work(){
        System.out.println("父类");
    }
}
