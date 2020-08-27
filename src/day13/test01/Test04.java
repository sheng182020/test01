package day13.test01;

import java.util.Collections;
import java.util.LinkedList;

public class Test04 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        Collections.addAll(list,"a","b","c");
        list.add("d");
        list.stream().forEach(i-> System.out.print(i));
        System.out.println();
        list.addFirst("e");
        list.stream().forEach(System.out::print);
        list.addLast("f");
        System.out.println();
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.removeFirst();
        list.stream().forEach(System.out::print);
        list.removeLast();
        System.out.println();
        list.stream().forEach(System.out::print);
    }

}
