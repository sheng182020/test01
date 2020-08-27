package day14.Test02_1;

import java.util.HashMap;
import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        String str=new Scanner(System.in).nextLine();
        HashMap<String,Integer> hashMap=new HashMap<>();
        String[] arr=str.split(" ");
        for (String s : arr) {
            if(hashMap.containsKey(s)){
                hashMap.put(s,(hashMap.get(s)+1));
            }else{
                hashMap.put(s,1);
            }
        }
        System.out.println(hashMap);
    }
}
