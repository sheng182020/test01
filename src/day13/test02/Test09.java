package day13.test02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Test09 {
    public static void main(String[] args) {
        ArrayList<String> array1=new ArrayList<>();
        Collections.addAll(array1,"a","b","a","c","d");
        ArrayList<String> array2=new ArrayList<>();
        Collections.addAll(array1,"e","f","a","d","g");
        HashSet<String> hashSet=new HashSet<>();
        hashSet.addAll(array1);
        hashSet.addAll(array2);
        System.out.println(hashSet);
    }
}
