package day09.Test08;

public class Test08 {
    public static void main(String[] args) {
        GouWuChe gouWuChe=new GouWuChe();
        Laptop laptop=new Laptop("g10000","笔记本",10000);
        Phone phone=new Phone("g10001","手机",5000);
        Fruit fruit=new Fruit("g20000","苹果",50);
        gouWuChe.addGoods(laptop);
        gouWuChe.addGoods(phone);
        gouWuChe.addGoods(fruit);
        gouWuChe.showGoods();
        gouWuChe.total();
    }
}
