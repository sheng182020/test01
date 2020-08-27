package day09.Test07;

public class Empleyee {
    String name;
    float Salary;
    public static float money=1000000;

    public static float getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return Salary;
    }

    public void setSalary(float salary) {
        Salary = salary;
    }

    public Empleyee(String name, float salary) {
        this.name = name;
        Salary = salary;
    }

}
