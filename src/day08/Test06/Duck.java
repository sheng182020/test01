package day08.Test06;

class Duck extends Animal{
    public void eat(){
        System.out.println(getAge()+"岁的"+getColor()+"的"+getName()+"在吃饭");
    }
    public void swim(){
        System.out.println(getAge()+"岁的"+getColor()+"的"+getName()+"在游泳");
    }
}
