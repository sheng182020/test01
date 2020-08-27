package day10.Test02;

class Teacher{
    String name;

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void teaName(Student stu,boolean work){

        System.out.println(work==true?"上课: "+stu.getName():"旷课: "+stu.getName());
    }
}
