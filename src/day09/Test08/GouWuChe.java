package day09.Test08;

import java.util.ArrayList;

public class GouWuChe {
    ArrayList list=new ArrayList();
    public void addGoods(Goods goods){
        list.add(goods);
    }
    public void showGoods(){
        System.out.println("============添加商品=============");
//        list.forEach(i -> System.out.println("加入  "+(Goods)i+"  成功"));
        for (int i = 0; i < list.size(); i++) {
            Goods a=(Goods)list.get(i);
            System.out.println("加入  "+a.getName()+"  成功");
        }
    }
    public void total(){
        System.out.println("============打印商品=============");
        System.out.println("您选购的商品为：");
//        list.forEach(i-> System.out.println("\t"+());
        float number=0;
        for (int i = 0; i < list.size(); i++) {
            Goods a=(Goods)list.get(i);
            System.out.println("\t"+a.getId()+","+a.getName()+","+a.getPrice());
            number+=a.getPrice();
        }
        System.out.println("----------------------------");
        System.out.println("原价为："+number);
        System.out.println("折后价为："+number*0.9);
    }
}
