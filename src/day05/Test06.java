package day05;

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
class Coder{
    String name;
    int id;
    int money;
    public Coder(){

    }
    public Coder(String name,int id,int money){
       this.name=name;
       this.id=id;
       this.money=money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public void intro(){
        System.out.println("程序员名字："+name+"\n工号："+id);
    }
    public void showSalary(){
        System.out.println("基本薪资："+money+",奖金无");
    }
    public void work(){
        System.out.println("正在努力写代码·····");
    }
}
class Manager{
    String name;
    int id;
    int money;
    int num;
    public Manager(){}
    public Manager(String name,int id,int money,int num){
        this.name=name;
        this.id=id;
        this.money=money;
        this.num=num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void intro(){
        System.out.println("程序员名字："+name+"\n工号："+id);
    }
    public void showSalary(){
        System.out.println("基本薪资："+money+",奖金为："+num);
    }
    public void work(){
        System.out.println("正在努力的做着管理工作，分配任务，检查员工提交上来的代码·····");
        System.out.println("==============================");
    }
}
