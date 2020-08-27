package day08.Test05;

public class Test05 {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.setName("王小平");
        teacher.setSubject("java");
        teacher.setAge(45);
        teacher.getTeacher();
        Student student=new Student();
        student.setResult(90);
        student.setName("李小乐");
        student.getStudent();
    }
}

