package day09.Test07;

public class Company implements Money {

    @Override
    public void paySalary(Empleyee emp) {
        Empleyee.money-=emp.getSalary();
        System.out.println("给"+emp.getName()+"发工资"+emp.getSalary()+"元，公司剩余"+(Empleyee.getMoney())+"  元");
    }
}
