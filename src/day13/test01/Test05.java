package day13.test01;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Test05 {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        Collections.addAll(hs,"zhangsan","lisi","wangwu","zhangsan");
        Iterator<String> iterator=hs.iterator();
        while(iterator.hasNext()){
            String str=iterator.next();
            System.out.println(str);
        }
    }
}
