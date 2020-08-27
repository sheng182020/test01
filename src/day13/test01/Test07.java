package day13.test01;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;

public class Test07 {
    public static void main(String[] args) {
        HashSet<Person> hashSet=new HashSet<>();
        Collections.addAll(hashSet,new Person("龚磊",3),new Person("曹鑫",2),new Person("龚磊",5),new Person("龚磊",3));
        hashSet.stream().forEach(i-> System.out.println(i.getName()+i.getAge()));
    }
}
class Person{
    private String name;
    private int age;

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
        this.age = age;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (o == null || getClass() != o.getClass()) {
//            return false;
//        }
//        Person person = (Person) o;
//        return age == person.age &&
//                Objects.equals(name, person.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }
    @Override
    public boolean equals(Object o){
        if(this==o){
            return true;
        }
        if(o==null||getClass()!=o.getClass()){
            return false;
        }
        Person person=(Person)o;
        return age==person.age&&Objects.equals(name,person.name);
    }
    @Override
    public int hashCode(){
        return Objects.hash(name,age);
    }
}
