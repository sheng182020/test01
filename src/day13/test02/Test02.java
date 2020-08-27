package day13.test02;

import java.util.Collections;
import java.util.HashSet;

public class Test02 {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        Collections.addAll(hashSet,"张三","李四","王五","二丫","钱六","孙七");
        hashSet.remove("二丫");
        hashSet.add("王小丫");
        System.out.println(hashSet);
    }
}
