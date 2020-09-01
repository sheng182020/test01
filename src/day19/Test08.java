package day19;

import java.io.*;

public class Test08 {
    public static void main(String[] args) throws IOException {
        Student stu;
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("D:\\stu.txt"));
        try {
            stu=(Student)objectInputStream.readObject();
            System.out.println(stu);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            objectInputStream.close();
        }

    }
}
