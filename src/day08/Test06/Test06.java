package day08.Test06;

public class Test06 {
    public static void main(String[] args) {
        Cock cock=new Cock();
        cock.setName("公鸡");
        cock.setAge(2);
        cock.setColor("红色");
        cock.eat();
        cock.say();
        Duck duck=new Duck();
        duck.setName("鸭子");
        duck.setColor("黑色");
        duck.setAge(1);
        duck.eat();
        duck.swim();
    }
}

