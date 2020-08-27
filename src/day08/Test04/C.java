package day08.Test04;

public class C extends B{
    private int numc=30;

    @Override
    public void showA() {
        System.out.println("A类中numa:"+getNuma());
    }

    @Override
    public void showB(){
        System.out.println("B类中numb:"+numb);
    }
    public void showC(){
        System.out.println("c类中numc:"+numc);
    }
    public void get(){
        System.out.println(super.getNuma());
    }
}
