package day10.Test02;

import java.util.ArrayList;

class className{
    String name;
    Teacher teacher;
    ArrayList<Student> students;

    public className() {
    }

    public className(String name, Teacher teacher, ArrayList<Student> students) {
        this.name = name;
        this.teacher = teacher;
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("课程名称："+getName());
        System.out.println("授课老师："+teacher.getName());
//        students.forEach(i-> System.out.println(teacher.teaName(i,true)+":"+i.getName()));
    }
}
