package day5.Test8;

public class Book{
    private String id;
    private String name;
    private String num;
    float money;
    String date;
    public Book(){

    }
    public Book(String id,String name,String num,float money,String date){
        this.id=id;
        this.name=name;
        this.num=num;
        this.money=money;
        this.date=date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public void showBook(){
        System.out.println("最贵的书是："+id+","+name+","+num+","+money+","+date);
    }
}
