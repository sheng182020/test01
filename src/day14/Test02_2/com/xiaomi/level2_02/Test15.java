package day14.Test02_2.com.xiaomi.level2_02;

public class Test15 {
    public static void main(String[] args) {
        Person person=new Person("小明",-20);
        System.out.println(person.getLifeValue());

        Person person1=new Person();
//        person1.setLifeValue(20);
        person1.setLifeValue(-20);
    }
}
