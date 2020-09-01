package day17.Test03;


import java.io.File;
import java.util.*;

public class Test03 {
    public static void main(String[] args) {
        String str=new Scanner(System.in).nextLine();
        File file=new File(str);
        HashMap<String,Integer> hashMap=new HashMap<>();
        getNum(file,hashMap);

         Set<Map.Entry<String, Integer>> entrySet=hashMap.entrySet();
         Iterator<Map.Entry<String,Integer>> iterator=entrySet.iterator();
         while(iterator.hasNext()){
             Map.Entry entry =iterator.next();
             System.out.println(entry.getKey()+"类型的文件有"+entry.getValue()+"个");
         }

    }
    public static void getNum(File file, HashMap<String,Integer> hashMap){
        File[] files=file.listFiles();
        for (File f : files) {
            if(f.isDirectory()){
                getNum(f,hashMap);
            }else if(f.isFile()){
                String key=file.getName().substring(file.getName().lastIndexOf(".")+1);
//                System.out.println(key);
                if(hashMap.containsKey(key)){
                    hashMap.put(key,hashMap.get(key)+1);
                }else{
                    hashMap.put(key,1);
                }
            }

        }
        for (String s : hashMap.keySet()) {
            System.out.println(s+"的类型的文件有"+hashMap.get(s)+"个");
        }


    }
}
