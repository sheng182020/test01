package day19;

import java.io.*;
import java.util.HashSet;

public class Test11 {
    public static void main(String[] args) throws IOException {
        HashSet<Student> hashSet=new HashSet<>();
        hashSet.add(new Student("梁接升2号",13,"女"));
        hashSet.add(new Student("梁接升",12,"女"));
        hashSet.add(new Student("梁接升3号",13,"女"));
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("D:\\stu.txt"));
        objectOutputStream.writeObject(hashSet);
        objectOutputStream.close();

    }
}
