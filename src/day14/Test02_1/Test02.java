package day14.Test02_1;

import java.util.HashMap;

public class Test02 {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("柳岩",2100);
        hashMap.put("张亮",1700);
        hashMap.put("诸葛亮",1800);
        hashMap.put("灭绝师太",2600);
        hashMap.put("东方不败",3800);
        hashMap.put("柳岩",hashMap.get("柳岩")+300);
        for (String s : hashMap.keySet()) {
            System.out.println(s+hashMap.get(s));
        }
    }
}
