package day14.Test01_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test04 {
    public static void main(String[] args) {
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("邓超","孙俪");
        hashMap.put("李晨","范冰冰");
        hashMap.put("刘德华","柳岩");
        hashMap.put("黄晓明","Baby");
        hashMap.put("谢霆锋","张柏芝");
        Set<String> keys=hashMap.keySet();
        Iterator<String> it=keys.iterator();
        while(it.hasNext()){
            String key=it.next();
            System.out.println(key+":"+hashMap.get(key));
        }
    }
}
