package day08.Test02;

public class Teacher extends Person{
    @Override
    public void work(){
        System.out.println(getName()+"上课");
    }
}
