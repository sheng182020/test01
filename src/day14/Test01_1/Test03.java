package day14.Test01_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test03 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1,"星期一");
        hashMap.put(2,"星期二");
        hashMap.put(3,"星期三");

        Set<Map.Entry<Integer,String>> entrySet=hashMap.entrySet();
        for (Map.Entry<Integer,String> entry:entrySet){
            int key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+":"+value );
        }

        Iterator<Map.Entry<Integer,String>> iterator=entrySet.iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,String> entry=iterator.next();
            int key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+":"+value);
        }
    }
}
