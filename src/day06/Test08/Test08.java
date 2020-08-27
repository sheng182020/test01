package day06.Test08;

import java.util.ArrayList;
import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        ArrayList<Book> list=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("需要输入几本书籍信息：");
        int bo=scanner.nextInt();
        for(int i=0;i<bo;i++){
            System.out.println("请录入第"+(i+1)+"本书的名称：");
            String a=scanner.next();
            System.out.println("请录入第"+(i+1)+"本书的ISBN编码：");
            String b=scanner.next();
            System.out.println("请录入第"+(i+1)+"本书的价格");
            Double c=scanner.nextDouble();
            Book book=new Book(a,b,c);
            list.add(book);
        }
        list.forEach(i -> System.out.println(i.getTitle()+","+i.getIsbn()+","+i.getPrice()));
//        System.out.println(list);
    }
}
