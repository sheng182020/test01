package day19;

import java.io.*;

public class Test07 {
    public static void main(String[] args) throws IOException {
        Student stu=new Student("小明",18,"男");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("D:\\stu.txt"));
        objectOutputStream.writeObject(stu);
        objectOutputStream.close();
    }
}
