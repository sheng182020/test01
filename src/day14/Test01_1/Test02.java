package day14.Test01_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test02 {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"星期一");
        map.put(2,"星期二");
        map.put(3,"星期三");
        Set<Integer> keys =map.keySet();
        for(Integer key:keys){
            String value=map.get(key);
            System.out.println(key+":"+value);
        }
        System.out.println();
        Iterator<Integer> it=keys.iterator();
        while(it.hasNext()){
            int i=it.next();
            System.out.println(i+":"+map.get(i));
        }
    }
}
