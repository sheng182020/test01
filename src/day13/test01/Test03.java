package day13.test01;

import java.util.LinkedList;

public class Test03 {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.toString());
        list.set(2,4);
        System.out.println("修改后："+list.toString());
        System.out.println("第一个元素："+list.get(0));

        System.out.println("集合大小："+list.size());
        list.remove(0);
        System.out.println("删除第一个元素"+list.toString());
        list.clear();
        System.out.println("清空集合："+list.toString());
    }


}
