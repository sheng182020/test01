package day12.Tset02.test2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test02 {
    public static void main(String[] args) {
        Collection<Person> collection=new ArrayList<Person>();
        collection.add(new Person("刘大",20,1.75));
        collection.add(new Person("曹二",19,1.70));
        collection.add(new Person("张三",18,1.80));
        collection.add(new Person("李四",17,1.60));
        collection.add(new Person("王五",16,1.65));
        Iterator<Person> iterator= collection.iterator();
        Person max=new Person();
        max.setHeight(iterator.next().getHeight());
        Person min=new Person();
        min.setHeight(iterator.next().getHeight());

        while(iterator.hasNext()){
            Person p=iterator.next();
            if(max.getHeight()<p.getHeight()){
                max.setHeight(p.getHeight());
                max.setAge(p.getAge());
                max.setName(p.getName());
            }
            if(min.getHeight()>p.getHeight()){
                min.setHeight(p.getHeight());
                min.setAge(p.getAge());
                min.setName(p.getName());
            }
        }
        System.out.println("最高的人："+max.getName()+",身高："+max.getHeight());
        System.out.println("最低的人："+min.getName()+",身高："+min.getHeight());
    }
}
