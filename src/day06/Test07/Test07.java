package day06.Test07;

import java.util.ArrayList;
import java.util.Iterator;

public class Test07 {
    public static void main(String[] args) {
        Worker w1=new Worker("bz001","黄渤",45);
        Worker w2=new Worker("bz002","孙红雷",48);
        Worker w3=new Worker("bz003","罗志祥",35);
        ArrayList<Worker> workers=new ArrayList<>();
        workers.add(w1);
        workers.add(w2);
        workers.add(w3);
        findMaxAge(workers);
    }
    public static void findMaxAge(ArrayList workers){
        Worker maxAgeWorker=(Worker)workers.get(0);
        Iterator it=workers.iterator();
        while(it.hasNext()){
            Worker w=(Worker) it.next();
            if(w.getAge()>=maxAgeWorker.getAge()){
                maxAgeWorker=w;
            }
        }
        System.out.println("最高年龄worker对象：");
        maxAgeWorker.show();

    }

}
