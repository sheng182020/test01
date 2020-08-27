package day08.Test03;

public class Test03 {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.setName("旺财");
        dog.setColor("黑色");
        dog.setPrice(10);
        dog.eat();
        dog.lookHome();
        System.out.println("----------------");
        Cat cat=new Cat();
        cat.setName("波斯猫");
        cat.setColor("白色");
        cat.setPrice(20);
        cat.eat();
        cat.catchMouse();
    }
}

