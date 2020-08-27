package day08.Test05;

class Student extends Person {
    private int result;

    public Student(){}
    public Student(int result) {
        this.result = result;
    }

    public Student(String name, int gae, int result) {
        super(name, gae);
        this.result = result;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
    public void getStudent(){
        System.out.println(getName()+"同学，考试得了："+getResult()+"分");
    }
}
