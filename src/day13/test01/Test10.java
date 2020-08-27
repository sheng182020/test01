package day13.test01;

import java.util.ArrayList;

public class Test10 {
    public static void main(String[] args) {
        for(String i:add("a","b","t","y")){
            System.out.println(i);
        }
    }
    public static ArrayList<String> add(String... str){
        ArrayList<String> list=new ArrayList<>();
        for(String s:str){
            list.add(s);
        }
        return list;
    }
}
