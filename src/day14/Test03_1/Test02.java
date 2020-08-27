package day14.Test03_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test02 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("及时雨","宋江");
        map.put("玉麒麟","卢俊义");
        map.put("智多星","吴用");
        map.put("入云龙","公孙胜");
        map.put("豹子头","林冲");
        map.remove("玉麒麟");
        map.put("智多星",null);
        Set<Map.Entry<String,String>> set=map.entrySet();
        Iterator<Map.Entry<String,String>> it=set.iterator();
        while(it.hasNext()){
            Map.Entry<String,String> map1= (Map.Entry<String,String>) it.next();
            if (map1.getKey().equals("及时雨")) {
                map.put("呼保义","宋江");
                map.remove("及时雨");
            }


        }
        System.out.println(map);
    }
}
