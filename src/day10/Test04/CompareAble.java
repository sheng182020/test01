package day10.Test04;

public interface CompareAble {
    public default Apple compare(Apple a,Apple b){
//        System.out.println(a.getSize()>b.getSize()?a.getSize()+"-"+a.getColor():b.getSize()+"-"+b.getColor());
        return a.getSize()>b.getSize()?a:b;
    }
}
