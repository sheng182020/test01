package day06;

import java.util.ArrayList;

public class Test04 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("孙悟空");
        list.add("猪八戒");
        list.add("沙和尚");
        list.add("铁扇公主");
        System.out.println("获取索引为3的元素："+list.get(3));
        list.set(3,"唐憎");
        list.remove(1);
        list.forEach(i -> System.out.println(i));
    }
}
