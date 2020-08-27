package demo01;

import java.util.ArrayList;
import java.util.List;

public class Txt {
    public static void main(String args[]){
        ArrayList list=new ArrayList();
        int x=8;
        System.out.println(jisuan(list,x));
        list.toArray();
    }
    public static  List jisuan(List list,int a){
        int b=0;
        if(a/2==1){
//            System.out.print(a%2);
//            System.out.print(a/2);
            list.add(a%2);
            list.add(a/2);

        }else{
//            System.out.print(a%2);
            list.add(a%2);
            a=a/2;
            jisuan(list,a);
        }
        return list;
    }
}
