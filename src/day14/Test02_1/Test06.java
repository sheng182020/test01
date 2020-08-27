package day14.Test02_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Test06 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("abc");
        list.add("bcd");
        HashMap<String,Integer> hashSet = new HashMap<>();
        char[] chars;
        for (String s : list) {
            chars=s.toCharArray();
            for (char c : chars) {
                String s1=String.valueOf(c);
                if(hashSet.containsKey(s1)){
                    hashSet.put(s1,(hashSet.get(s1)+1));
                }else{
                    hashSet.put(s1,1);
                }
            }
        }
        System.out.println(hashSet);
    }
}
