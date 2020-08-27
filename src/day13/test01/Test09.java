package day13.test01;

import java.util.ArrayList;
import java.util.Collections;

public class Test09 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,33,11,77,55);
        Collections.sort(list);
        for (int i:list){
            System.out.print(i+"  ");
        }
        System.out.println();
        Collections.shuffle(list);
        for (int i:list){
            System.out.print(i+"  ");
        }
    }
}
