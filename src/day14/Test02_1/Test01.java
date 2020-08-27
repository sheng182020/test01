package day14.Test02_1;

import java.util.HashMap;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args){

        HashMap<String,String> hashMap=new HashMap<>();
        while(hashMap.size()<=5){
            String str=new Scanner(System.in).nextLine();
            String[] arr=str.split(",");
            hashMap.put(arr[0],arr[1]);
        }
        System.out.println(hashMap);
    }
}
