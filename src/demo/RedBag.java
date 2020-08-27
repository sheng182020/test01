package demo;

import java.util.ArrayList;

class User{
    //用户名
    private String username;
    //余额
    private Double leftMoney;
    public User() {
    }
    public User(String username, Double leftMoney) {
        this.username = username;
        this.leftMoney = leftMoney;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public Double getLeftMoney() {
        return leftMoney;
    }
    public void setLeftMoney(Double leftMoney) {
        this.leftMoney = leftMoney;
    }
    //定义查看用户信息方法
    public void show(){
        System.out.println("用户名： "+username+";余额： "+leftMoney);
    }

}

class QunZhu extends User{
    public QunZhu() {
    }
    public QunZhu(String username, Double leftMoney) {
        super(username, leftMoney);
    }
    /* 100 发5个包, 每个包20元 20, 20, 20, 20, 20. 选择数组或集合
    群主发红包功能
    1.明确返回值:因为红包会分成很多份,所以使用ArrayList来保存分好的红包并返回
    2.明确参数列表: 红包金额,份数
    发红包的逻辑
    1.定义一个集合存放分好的钱
    2.从自己的余额中扣除发的钱
    3.计算每份有多少钱
    4.将分好的钱放到集合中
    5.返回集合
    */
    public ArrayList<Double> faHongBao(Double money, int count){
        ArrayList< Double> list=new ArrayList<>();
//计算群主当前余额
        double newLeftMoney = getLeftMoney()-money;
        setLeftMoney(newLeftMoney);
        double newMoney = money / count;
        for(int i=0;i<count;i++){
            list.add(newMoney);
        }
        return list;
    }
}

class ChengYuan extends User {
    public ChengYuan() {
    }
    public ChengYuan(String username, Double leftMoney) {
        super(username, leftMoney);
    }
    /*
    收红包:
    1.明确返回值类型: 不需要返回 void
    2.明确参数列表: 红包集合ArrayList集合
    0 1 2 3 4
    [20, 20, 20, 20, 20] size() = 5
    收红包逻辑:
    1.从红包集合中取第一个红包出来
    2.自己的余额增加取到的钱
    类名作为参数拿到的是对象的地址
    */
    public void shouHongBao(ArrayList<Double> list) {
        System.out.println("333: " + list);
// 1.3 从红包集合中取第一个红包出来
        double money = list.remove(0);
// 2.自己的余额增加取到的钱
// 2.1 取出当前余额
// 2.2 最新余额 = 当前余额+收到的红包金额
        double newMoney = getLeftMoney() + money;
// 2.3 将最新余额保存成员变量中
        setLeftMoney(newMoney);
    }
}

public class RedBag {
    public static void main(String[] args){
        // 测试
// 创建群主
        QunZhu qz = new QunZhu("老王吧", 100.0);
        qz.show();
// 创建3个成员
        ChengYuan m1 = new ChengYuan("小王吧", 10.0);
//课后请同学自己思考并完成扩展需求。 案例扩展：
//1. 如果成员的余额不为0呢，将如何处理？
//2. 如果群主发的红包大于群主的余额，将如何处理？
        ChengYuan m2 = new ChengYuan("二王吧", 10.0);
        ChengYuan m3 = new ChengYuan("大王吧", 10.0);
        m1.show();
        m2.show();
        m3.show();
        System.out.println("‐‐‐‐‐‐‐‐‐‐‐‐发红包后‐‐‐‐‐‐‐‐‐‐‐‐");
// 群主发红包
        ArrayList< Double> hongBao = qz.faHongBao(30.0,3);
        System.out.println("222: " + hongBao);
        qz.show();
// 成员收红包
        m1.shouHongBao(hongBao);
        m2.shouHongBao(hongBao);
        m3.shouHongBao(hongBao);
        m1.show();
        m2.show();
        m3.show();
    }
}
