package day5.Test6;

public class Manager{
    private String name;
    private int id;
    private int money;
    private int num;
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
