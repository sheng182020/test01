package day13.test01;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test08 {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<String>();
        Collections.addAll(linkedHashSet,"王昭君","王昭君","王昭君","西施","杨玉环","貂蝉");
        Iterator iterator=linkedHashSet.iterator();
        while (iterator.hasNext()){
            String str= (String) iterator.next();
            System.out.println(str);
        }
        for (String s:linkedHashSet) {
            System.out.println(s);
        }
    }
}
