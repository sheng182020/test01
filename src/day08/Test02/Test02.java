package day08.Test02;

public class Test02 {
    public static void main(String[] args) {
        Coder coder=new Coder();
        coder.setName("马化腾");
        coder.setAge(45);
        coder.eat();
        coder.sleep();
        coder.work();
        System.out.println("-----------------");
        Teacher teacher=new Teacher();
        teacher.setName("马云");
        teacher.setAge(50);
        teacher.eat();
        teacher.sleep();
        teacher.work();
    }
}

