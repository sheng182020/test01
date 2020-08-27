package day05;

public class Test03 {
    public static void main(String[] args) {
        Teacher t=new Teacher();
        t.setAge(30);
        t.setName("周老师");
        t.setContent("java面向对象");
        t.eat();
        t.teach();
        Student stu=new Student("韩同学",18,"java面向对象");
        stu.eat();
        stu.study();
    }
}
class Teacher{
    String name;
    int age;
    String content;
    public Teacher(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void eat(){
        System.out.println("年龄为"+age+"的"+name+"正在吃饭······");
    }
    public void teach(){
        System.out.println("年龄为"+age+"的"+name+"正在亢奋的讲着"+content+"的知识······");
    }
}
class Student{
    String name;
    int age;
    String content;
    public Student(String name,int age,String content){
        this.name=name;
        this.age=age;
        this.content=content;
    }
    public void eat(){
        System.out.println("年龄为"+age+"的"+name+"正在吃饭······");
    }
    public void study(){
        System.out.println("年龄为"+age+"的"+name+"正在专心致志的听着"+content+"的知识······");
    }
}
