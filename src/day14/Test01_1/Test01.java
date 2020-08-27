package day14.Test01_1;

import java.util.HashMap;

public class Test01 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1,"星期一");
        hashMap.put(2,"星期一");
        System.out.println(hashMap);
        hashMap.put(2,"星期二");
        System.out.println(hashMap);
        System.out.println("获取元素："+hashMap.get(1));
        hashMap.remove(1);
        System.out.println("删除后的map集合"+hashMap);
    }
}
