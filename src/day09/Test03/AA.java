package day09.Test03;

interface AA{
    public abstract void showA();
    public default void show10(String str){
        for (int i = 0; i <10 ; i++) {
            System.out.print(str+"\t");
        }
    };
    public default void showB10(){
        show10("BBBB");
        System.out.println();
    }
    public default void showC10(){
        show10("CCCC");
        System.out.println();
    }
}
