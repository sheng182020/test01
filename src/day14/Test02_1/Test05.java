package day14.Test02_1;

import java.util.HashMap;
import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        String str=new Scanner(System.in).nextLine();
        HashMap<String,Integer> hashMap=new HashMap<>();
        char[] chars=str.toCharArray();
        for (char ch : chars) {
            if (ch==' '){
                countingKey(hashMap,"空格");
            }else if(ch>=65&ch<=90|ch>=97&ch<=122){
                countingKey(hashMap,"字母");
            }else if(ch>=48&ch<=57){
                countingKey(hashMap,"数字");
            }else{
                countingKey(hashMap,"其他");
            }
        }
        System.out.println(hashMap);
    }
    public static void countingKey(HashMap<String,Integer> map,String key){
        if (map.containsKey(key)){
            map.put(key,(map.get(key)+1));
        }else {
            map.put(key,1);
        }
    }
}
