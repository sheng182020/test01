package day06.Test06;

import java.util.ArrayList;

public class Test06 {
    public static void main(String[] args) {
        Teacher t1=new Teacher("姚小明",23,"打篮球");
        Teacher t2=new Teacher("景甜",20,"打羽毛球");
        Teacher t3=new Teacher("薛之谦",45,"踢足球");
        ArrayList list=new ArrayList();
        list.add(t1);
        list.add(t2);
        list.add(t3);
        for(int i=0;i<list.size();i++){
            Teacher teacher=(Teacher) list.get(i);
            System.out.println(teacher.getName()+","+teacher.getAge()+","+teacher.getLike());
            if(teacher.getAge()>40){
                teacher.setLike("打高尔夫球");
                System.out.println("------------------------------------------------");
                teacher.show();
            }
        }
    }
}
