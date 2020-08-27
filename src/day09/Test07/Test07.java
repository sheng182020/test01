package day09.Test07;

public class Test07 {
    public static void main(String[] args) {
        Empleyee m=new Manager("张小强",9000);
        Empleyee c=new Coder("李小强",5000);
        Company company=new Company();
        company.paySalary(m);
        company.paySalary(c);
    }
}
