package day13.test03;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        Random random=new Random();
        int e=random.nextInt(16)+1;
        String blue="蓝"+e;
        hashSet.add(blue);
        while(hashSet.size()<6){
            int a=random.nextInt(33)+1;
            String red="红"+a;
            hashSet.add(red);
        }

        System.out.println(hashSet);

    }
}
