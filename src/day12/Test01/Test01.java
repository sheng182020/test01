package day12.Test01;

import java.util.ArrayList;
import java.util.Collection;

public class Test01 {
    public static void main(String[] args) {
        Collection<Integer> collection=new ArrayList<Integer>();
        collection.add(1);
        collection.add(3);
        collection.add(5);
        System.out.println("collection集合大小："+collection.size());
        System.out.println("判断是否存在3："+collection.contains(3));
        collection.remove(3);
        System.out.println("数组："+collection.toString());
        collection.clear();
        System.out.println("判断是否为空："+collection.isEmpty());
    }
}
