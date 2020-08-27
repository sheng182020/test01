package day09.Test06;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"学生餐");
    }
    public void sutdy(){
        System.out.println("学习");
    }
}
