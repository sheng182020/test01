package day14.Test02_1;


import java.util.*;

public class Test08 {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap=new HashMap<>();
        Random random=new Random(80);
        while(hashMap.size()<5){
            String str=new Scanner(System.in).nextLine();
            int result=random.nextInt(100)+1;
            System.out.println(result);
            hashMap.put(str,result);
        }
        Set<Map.Entry<String,Integer>> entrySet=hashMap.entrySet();
        Iterator<Map.Entry<String,Integer>> it=entrySet.iterator();
        int num=0;
        int max=hashMap.get(it.next().getKey());
        int min=hashMap.get(it.next().getKey());
        for (String s : hashMap.keySet()) {
            if (hashMap.get(s)<min){
                min=hashMap.get(s);
            }
            if (hashMap.get(s)>max){
                max=hashMap.get(s);
            }
            num+=hashMap.get(s);
        }
        System.out.println("总分="+num+"，最高分="+max+"，最低分="+min+",平均分="+num/hashMap.size());

    }
}
