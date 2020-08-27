package day09.Test06;

public class Teacher extends Person {
    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"学生餐");
    }
    public void teach(){
        System.out.println("讲课");
    }
}
