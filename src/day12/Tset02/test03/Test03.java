package day12.Tset02.test03;

import java.util.ArrayList;

public class Test03 {
    public static void main(String[] args) {
        ArrayList<String> ArrayList=new ArrayList<String>();
        ArrayList.add("a");
        ArrayList.add("b");
        ArrayList.add("c");
        ArrayList.add("c");
        ArrayList.add("a");
        ArrayList.add("b");
        ArrayList.add("b");
        ArrayList.add("b");
        ArrayList.add("a");
        System.out.println("a统计次数："+frequency(ArrayList,"a"));;
    }
    public  static int frequency(ArrayList arr,String key){
        int a=0;
        for (Object i:arr) {
            if(key.equals((String)i)){
                a+=1;
            }
        }
        return a;
    }
}
