package day14.Test03_1;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();
        String[] arr={"苹果","香蕉","橘子"};
        int s=0;
        hashMap.put(12345678,"西瓜");
        while (hashMap.size()<4){
            int i=new Random().nextInt(99999999)+10000000;
            if(!hashMap.containsKey(i)){
                hashMap.put(i,arr[s]);
                s++;
            }
        }
        System.out.println(hashMap+"请输入查询水果商品号：");
        int a=new Scanner(System.in).nextInt();
        if(hashMap.containsKey(a)){
            System.out.println("根据商品号："+a+"对应的商品为："+hashMap.get(a));
        }else{
            System.out.println("查无此商品！");
        }




    }
}
