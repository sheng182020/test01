package day5.Test6;

public class Coder{
    private String name;
    private int id;
    private int money;
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
