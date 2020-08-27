package day12.Tset02.test04;

import java.util.ArrayList;

public class Test04 {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<String>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        list1.add("e");
        swap(list1,1,2);
        System.out.println(list1.toString());

        ArrayList<Integer> list2=new ArrayList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        swap(list2,1,3);
        System.out.println(list2.toString());

    }
    public static <E> void swap(ArrayList<E> arr, int x,int y){
        if(x<arr.size()&y<arr.size()){
            ArrayList<E> list=new ArrayList<E>();
            list.add(arr.get(x));
            arr.set(x,arr.get(y));
            arr.set(y,list.get(0));
        }else {
            System.out.println("位置不正确");
        }

    }
}
