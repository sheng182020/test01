package day14.Test02_1;

import java.util.HashMap;

public class Test03 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1,"张三丰");
        hashMap.put(2,"周芷若");
        hashMap.put(3,"汪峰");
        hashMap.put(4,"灭绝师太");
        for (Integer integer : hashMap.keySet()) {
            System.out.println(integer+hashMap.get(integer));
        }
        System.out.println();
        hashMap.put(5,"李晓红");
        hashMap.remove(1);
        hashMap.put(2,"周林");
        for (Integer integer : hashMap.keySet()) {
            System.out.println(integer+hashMap.get(integer));

        }
    }
}
