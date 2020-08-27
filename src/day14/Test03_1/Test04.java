package day14.Test03_1;

import java.util.*;

public class Test04 {
    public static void main(String[] args) {
        HashMap<Integer,String> pokerMap=new HashMap<>();
        ArrayList<String> colors=new ArrayList<>();
        ArrayList<String> numbers=new ArrayList<>();

        Collections.addAll(colors,"♠","♥","♣","♦");
        Collections.addAll(numbers,"2","A","K","Q","J","10","9","8","7","6","5","4","3");
        int count=1;
        pokerMap.put(count++,"大王");
        pokerMap.put(count++,"小王");
        for (String number : numbers) {
            for (String color : colors) {
                String card=color+number;
                pokerMap.put(count++,card);
            }
        }

        ArrayList<String> play1=new ArrayList<>();
        ArrayList<String> play2=new ArrayList<>();
        ArrayList<String> play3=new ArrayList<>();
        ArrayList<String> dipai=new ArrayList<>();
        ArrayList<Integer> numberList=new ArrayList<>();//所有牌的号码
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> ls=new ArrayList<>();

        for (Integer i : pokerMap.keySet()) {
            numberList.add(i);
        }
        Collections.shuffle(numberList);
        int a=0;
        for (Integer integer : numberList) {
            if(a<3){
                ls.add(integer);
                dipai.add(pokerMap.get(integer));
            }else if(a>=3&a<20){
                if(pokerMap.get(integer)=="大王"){
                    diZhu(list,ls);
                }
                list.add(integer);
                if(a==19){
                    Collections.sort(list);
                    for (Integer i : list) {
                        play1.add(pokerMap.get(i));
                    }
                    list.clear();
                }
            }else if(a>=20&a<37){
                if(pokerMap.get(integer)=="大王"){
                    diZhu(list,ls);
                }
                list.add(integer);
                if(a==36){
                    Collections.sort(list);
                    for (Integer i : list) {
                        play2.add(pokerMap.get(i));
                    }
                    list.clear();
                }
            }else{
                if(pokerMap.get(integer)=="大王"){
                    diZhu(list,ls);
                }
                list.add(integer);
                if(a==53){
                    Collections.sort(list);
                    for (Integer i : list) {
                        play3.add(pokerMap.get(i));
                    }
                    list.clear();
                }
            }
            a++;
        }
        

        
        System.out.println(play1);
        System.out.println(play2);
        System.out.println(play3);
        System.out.println(dipai);

    }
    public static void diZhu(ArrayList<Integer> arr,ArrayList<Integer> ls){
        arr.addAll(ls);
    }
}
