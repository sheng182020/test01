package day12.Test01;

import java.util.ArrayList;
import java.util.Collection;

public class Test05 {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<String>();
        collection.add("xiaomi");
        collection.add("xiaomi2");
        collection.add("xiaomi3");
        collection.add("xiaomi4");
        for (String str:collection) {
            System.out.println(str);
        }
    }
}
