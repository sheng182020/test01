package day08.Test06;

class Cock extends Animal{
    public void eat(){
        System.out.println(getAge()+"岁的"+getColor()+"的"+getName()+"在啄米");
    }
    public void say(){
        System.out.println(getAge()+"岁的"+getColor()+"的"+getName()+"在打鸣");
    }
}
