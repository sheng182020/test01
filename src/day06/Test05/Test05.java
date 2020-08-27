package day06.Test05;

import java.util.ArrayList;
import java.util.Iterator;

public class Test05 {
    public static void main(String[] args) {
        Student s1=new Student("it001","黄渤",1.72);
        Student s2=new Student("it002","孙红雷",1.78);
        Student s3=new Student("it003","章子怡",1.64);
        Student s4=new Student("it004","杨颖",1.68);

        ArrayList list=new ArrayList();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
//        System.out.println(list);
        System.out.println("集合大小"+list.size());
/*        for(int i=0;i<list.size();i++){
            Student stu=(Student)list.get(i);
            System.out.println(stu.getId()+","+stu.getName()+","+stu.getHeight());
        }*/

/*        for(Object o:list){
            Student stu=(Student)o;
            System.out.println(stu.getId()+","+stu.getName()+","+stu.getHeight());
        }*/

        list.forEach(i -> System.out.println(((Student)i).getId()+","+((Student)i).getName()+","+((Student)i).getHeight()));

        System.out.println("--------------------------------------------------\n身高1.70以上的学员：");

        Iterator it= list.iterator();
        while (it.hasNext()) {
            Student stu=(Student)it.next();
            if(stu.getHeight()>1.70){
                System.out.println(stu.getId()+","+stu.getName()+","+stu.getHeight());
            }
        }


    }
}
