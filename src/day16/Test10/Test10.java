package day16.Test10;

import java.util.ArrayList;
import java.util.Random;

public class Test10 {
    static boolean flag=false;

    public static void main(String[] args) {
        Object obj=new Object();
        Person person=new Person();
        ArrayList<Person> list=new ArrayList<>();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    synchronized (person){
                        if (flag==true){
                            try {
                                person.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        try {
                            int a=new Random().nextInt(100);
                            person.setName("小明"+a);
                            person.setSex(a/2==0?"男":"女");
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        flag=true;
                        person.notifyAll();
                    }
                }

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    synchronized (person){
                        if(flag==false){
                            try {
                                person.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        try {
                            System.out.println(person);
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        flag=false;
                        person.notifyAll();

                    }
                }
            }
        }).start();
    }
}
