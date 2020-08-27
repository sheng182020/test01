package demo;

public class duixiang {
    public static void main(String[] args) {
        Friend f=new Friend("陈",3);
        f.say();
    }
}
class Friend{
    String name;
    int age;
    public Friend(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void say(){
        System.out.println(name +"\t"+age);
    }
}
