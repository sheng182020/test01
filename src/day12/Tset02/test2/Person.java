package day12.Tset02.test2;

class Person{
    private String name;
    private int age;
    private double height;

    public Person() {
    }

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

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
        if (age>0){
            this.age = age;
        }else{
            this.age=0;
        }

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height>0){
            this.height = height;
        }else{
            this.height=0;
        }
    }
}
