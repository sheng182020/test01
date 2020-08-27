package day09.Test06;

public abstract class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
        if(this.age>0){
            this.age = age;
        }else{
            this.age=0;
        }

    }

    public abstract void eat();

}
