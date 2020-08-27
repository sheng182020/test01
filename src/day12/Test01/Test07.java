package day12.Test01;

public class Test07 {
    public static void main(String[] args) {
         Inter<String> Imple1=new Inter<String>() {
            @Override
            public <String> void show(String e) {
                System.out.println(e+"8.20早上打瞌睡");
            }
        };
         Imple1.show("我");

        Inter<Integer> Imple2=new Inter<Integer>() {
            @Override
            public <E> void show(E e){
                System.out.println(e);
            }
        };
        Imple2.show(123);
    }
}
interface Inter<E>{
    <E>void show(E e);
}
