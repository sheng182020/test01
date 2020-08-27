package day5.Test6;

public class Test06 {
    public static void main(String[] args) {
        Manager manager=new Manager("James",9527,15000,3000);
        manager.intro();
        manager.showSalary();
        manager.work();

        Coder coder=new Coder();
        coder.setId(0025);
        coder.setMoney(10000);
        coder.setName("Kobe");
        coder.intro();
        coder.showSalary();
        coder.work();
    }
}

