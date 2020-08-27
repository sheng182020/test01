package day10.Test03;

import java.util.ArrayList;


public class Test03 {
    public static void main(String[] args) {
        ArrayList<User> list=new ArrayList<>();
        for (int i = 1; i <=50 ; i++) {
            list.add(new User("null",i));
        }
        System.out.println("未分组：");
        list.forEach(i-> System.out.print(i.getId()+"-"+i.getSort()+",  "));
        System.out.println();
        System.out.println("已分组：");
        Receptionist receptionist=new Receptionist();
        receptionist.setSort(list);
    }
}
