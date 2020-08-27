package day13.test02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Test06 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<>();
        while(hashSet.size()<10){
            Random random=new Random();
            int r=random.nextInt(20);
            hashSet.add(r);
        }
        Iterator<Integer> it=hashSet.iterator();
        while(it.hasNext()){
            int i= it.next();
            System.out.print(i+"  ");
        }


    }
}
