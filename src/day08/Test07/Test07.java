package day08.Test07;

public class Test07 {
    public static void main(String[] args) {
        Manager manager=new Manager();
        manager.setId("m110");
        manager.setName("老王");
        manager.setSalary(10000.0f);
        manager.eat();
        manager.work();
        Cooker cooker=new Cooker();
        cooker.setId("c110");
        cooker.setName("小王");
        cooker.setSalary(6000.0f);
        cooker.eat();
        cooker.work();
    }
}

