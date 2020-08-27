package day13.test02;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Test03 {
    public static void main(String[] args) {
        String[] strs={"12345","67891","213546","89656564","64524","1234589","67891"};
        LinkedList<String> list=new LinkedList<>();

        for (String s:strs){
            if (!list.contains(s)){
                list.add(s);
            }
        }
        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){
            String s=iterator.next();
            System.out.print(s+"   ");
        }

     }
}
