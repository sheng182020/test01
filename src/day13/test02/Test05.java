package day13.test02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Test05 {
    public static void main(String[] args) {
        String arr[]={"abc","bab","abc","aab","bab","cef","jhi"};
        ArrayList<String> arrayList=new ArrayList<>();
        HashSet<String> hashSet=new HashSet<>();
        hashSet.addAll(Arrays.asList(arr));
        arrayList.addAll(hashSet);
        System.out.println(arrayList);
    }
}
