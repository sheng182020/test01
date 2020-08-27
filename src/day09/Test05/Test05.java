package day09.Test05;

public class Test05 {
    public static void main(String[] args) {
        Animal dog=new Dog();
        dog.eat();
        Animal cat=new Cat();
        cat.eat();
        tf(dog);
        tf(cat);
    }
    public static void tf(Animal a){
        if(a instanceof Cat){
            Cat c=(Cat)a;
            c.catchMouse();
        }else if(a instanceof Dog){
            Dog d=(Dog)a;
            d.lookHome();
        }
    }
}

