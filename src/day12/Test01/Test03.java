package day12.Test01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test03 {
    public static void main(String[] args) {
        Collection<String> conllecton=new ArrayList<String>();
        conllecton.add("abc1");
        conllecton.add("abc2");
        conllecton.add("abc3");
        conllecton.add("abc4");
        Iterator<String> it=conllecton.iterator();
        while(it.hasNext()){
            String str=it.next();
            System.out.println(str);
        }
    }
}
