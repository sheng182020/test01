package day14.Test02_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        String str=new Scanner(System.in).nextLine();
        char[] chars=str.toCharArray();
        HashMap<String,Integer> map=new HashMap<>();
        for (char c : chars) {
            String s=String.valueOf(c);
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else{
                map.put(s,1);
            }
        }
        for (String s : map.keySet()) {
            System.out.print(s+"("+map.get(s)+")");
        }
    }
}
