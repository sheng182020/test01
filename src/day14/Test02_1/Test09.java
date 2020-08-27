package day14.Test02_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test09 {
    public static void main(String[] args) {
        System.out.println("请输入格式为： 书名-价格");
        HashMap<String,Double> hashMap=new HashMap<>();
        while(hashMap.size()<5){
            String[] arr=new Scanner(System.in).nextLine().split("-");
            hashMap.put(arr[0],Double.parseDouble(arr[1]));
        }
        hashMap.remove("C++");
        hashMap.put("Java",38.5);
        for (String s : hashMap.keySet()) {
            System.out.println(s+"="+hashMap.get(s));
        }
        System.out.println();
        Set<Map.Entry<String,Double>> entry=hashMap.entrySet();
        for (Map.Entry<String, Double> e : entry) {
            System.out.println(e.getKey()+"="+e.getValue());
        }
    }
}
