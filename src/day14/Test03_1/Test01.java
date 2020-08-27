package day14.Test03_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test01 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap1=new HashMap<>();
        HashMap<Integer,String> hashMap2=new HashMap<>();
        HashMap<String,HashMap<Integer,String>> hashMap=new HashMap<>();
        hashMap1.put(001,"李晨");
        hashMap1.put(002,"范冰冰");
        hashMap2.put(001,"马云");
        hashMap2.put(002,"马化腾");
        hashMap.put("Java基础班",hashMap1);
        hashMap.put("java就业班",hashMap2);
        for (String s : hashMap.keySet()) {
            System.out.println("班名："+s+"："+hashMap.get(s));
            for (Integer i: hashMap.get(s).keySet()) {
                System.out.println("\t"+i+" "+hashMap.get(s).get(i));
            }
        }

        Set<Map.Entry<String, HashMap<Integer, String>>> set=hashMap.entrySet();
        for (Map.Entry<String, HashMap<Integer, String>> mapEntry : set) {
            System.out.println(mapEntry.getKey()+mapEntry.getValue());
        }

    }
}
