package day08.Test05;

class Teacher extends Person {
    private String Subject;

    public Teacher(){}
    public Teacher(String subject) {
        Subject = subject;
    }

    public Teacher(String name, int gae, String subject) {
        super(name, gae);
        Subject = subject;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }
    public void getTeacher(){
        System.out.println(getName()+"老师，讲授"+getSubject()+"课");
    }
}
