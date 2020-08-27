package day16.Test06;

public class TestInvokeDirect {
    public static void main(String[] args) {
        invokeDirect(()-> {
            System.out.println("标准lambda");
        });


        invokeDirect(()->
            System.out.println("省略lambda")
        );
    }
    private static void invokeDirect(Director director){
        director.makeMovie();
    }
}
