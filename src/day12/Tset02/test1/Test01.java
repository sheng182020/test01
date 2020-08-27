package day12.Tset02.test1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test01 {
    public static void main(String[] args) {
        Collection<Student> ArrayList=new ArrayList<Student>();
        ArrayList.add(new Student("甲",18,88));
        ArrayList.add(new Student("乙",17,75));
        ArrayList.add(new Student("丙",19,66));
        ArrayList.add(new Student("丁",20,99));
        ArrayList.add(new Student("卯",18,89));
        Iterator<Student> it=ArrayList.iterator();
        int number=0;
        int max=0;
        int min=100;
        while(it.hasNext()){
            Student stu=it.next();
            number+=stu.getScore();
//            System.out.println(number);
            if(stu.getScore()>max){
                max=stu.getScore();
            }
            if(stu.getScore()<min){
                min=stu.getScore();
            }

        }
        System.out.println("最高分："+max+",最低分："+min+"平均分："+number/ArrayList.size()+",总分："+number);
    }
}
