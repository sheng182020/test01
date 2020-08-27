package day10.Test04;

public class Test04 {
    public static void main(String[] args) {
        Apple a1=new Apple(5,"青色");
        Apple a2=new Apple(3,"红色");
        System.out.println("默认挑大的：");
        Apple bigapple=new wroker().pickApple(new Compare(),a2,a1);
        System.out.println(bigapple.getSize()+"-"+bigapple.getColor());

        Apple redapple=new wroker().pickApple(new Compare(){
            @Override
            public Apple compare(Apple a,Apple b) {
                return (a.getColor().equals("红色") ? a : b);
            }
        },a1,a2);
        System.out.println("挑红的：");
        System.out.println(redapple.getSize()+"-"+redapple.getColor());
    }
}
