package day16;

import java.util.*;

public class Test09 {
    public static void main(String[] args) {
        System.out.println("list:");
        List<Integer> list= Arrays.asList(8,56,23,33,7);
        list.stream().map(i->i+",").forEach(System.out::print);

        System.out.println("\nset:");
        Set<Integer> set=new HashSet<>();
        set.addAll(list);
        set.stream().forEach(n-> System.out.print(n+" "));

        System.out.println("\nmap:");
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1,"one");
        hashMap.put(2,"two");
        hashMap.put(3,"three");
        hashMap.keySet().forEach(m-> System.out.print(m+":"+hashMap.get(m)+" "));
    }
}
