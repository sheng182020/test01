package day05;

public class Test02 {
    public static void main(String[] args) {
        Dog dog=new Dog("旺财",12);
        dog.showMsg();
    }

}
class Dog{
    private String name;
    private int age;
    public Dog(){

    }
    public Dog(String name,int age){
        this.name=name;
        this.age=age;
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
    public void showMsg(){
        System.out.println("狗的名字："+name+",年龄为："+age);
    }
}
