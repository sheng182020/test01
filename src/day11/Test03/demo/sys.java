package day11.Test03.demo;

import java.util.ArrayList;
import java.util.Scanner;

class sys{
    ArrayList<Commodity> list=new ArrayList<>();
    String regex1="^[1-9]\\d*$";
    String regex2="^[0-9]\\d*$";
    ArrayList<Commodity> che=new ArrayList<>();
    static double num=0;//价格
    static int x=0;
    private boolean flag=true;
    private boolean falge=true;

    public void dity(){
        Commodity com1=new Commodity(001,"少林核桃",15.5,"斤");
        Commodity com2=new Commodity(002,"尚康饼干",14.5,"包");
        Commodity com3=new Commodity(003,"移动硬盘",345.0,"个");
        Commodity com4=new Commodity(004,"高清无码",199.0,"G");
        list.add(com1);
        list.add(com2);
        list.add(com3);
        list.add(com4);
    }
    public void comn(){
        list.forEach(i-> System.out.println(((Commodity)i).getId()+"\t"+((Commodity)i).getName()+"\t"+((Commodity)i).getPrice()+"\t"+((Commodity)i).getUnit()));
        System.out.println("------------------------------------");
        System.out.println("请输入您要购买的商品项（输入格式：商品id-购买数量），输入end表示购买结束。");
//        boolean flag=true;
        while(flag){
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            if (str.equals("end")){
                System.out.println("购买结束");
//                systemShow();
                this.flag=false;
                break;
            }else if(str.length()<5){
                System.out.println("你输入的购买姿势不对，请换个姿势再来一次（格式 id-购买数量）");
                continue;
            }else if(str.substring(0,3).matches(regex2)&str.substring(3,4).equals("-")){

                if(Integer.parseInt(str.substring(4))<1){
                    System.out.println("你输入的商品id不存在，请重新输入！！");
                    continue;
                }else{
                    add:for (int i = 0; i < list.size(); i++) {
                        Integer n = Integer.parseInt(str.substring(0, 3));
                        if (n == Integer.valueOf(list.get(i).getId())) {
                            int v=Integer.parseInt(str.substring(4));
                            list.get(i).setNumber(v);
                            che.add(list.get(i));
                            x+=v;
                            num=list.get(i).getPrice()*Integer.parseInt(str.substring(4))+num;

                            break add;
//                            continue;
                        }else{
                            if(i==list.size()-1){
                                System.out.println("你输入的商品id不存在，请重新输入！！");
                                break add;
                            }
                        }

//                        System.out.println("你输入的商品id不存在，请重新输入！！");
                        continue ;
                    }
                    continue;
                }
            }else{
                System.out.println("你输入的购买姿势不对，请换个姿势再来一次（格式 id-购买数量）");
            }

            continue;
        }
        systemShow();
        int y=new Scanner(System.in).nextInt();
        printA(y);
    }


    public void printA(int one) {
//        boolean falge=true;
        while(falge){
            if (one==1){
                System.out.println("------------------------------------");
                System.out.println("\t\t\t商品列表");
                System.out.println("商品id\t名称\t单价\t计价单位");
                comn();
            }else if(one==2){
                System.out.println("------------------------------------");
                System.out.println("\t\t\t欢迎光临");
                System.out.println("名称\t售价\t数量\t金额");
                add();
            }else if(one==3){
                System.out.println("感谢使用超市购物系统，欢迎下次光临，拜拜！");
                this.falge=false;
                break;
//                return;
            }else{
                falge=false;
            }
        }
        return;

    }
    public void add(){
        System.out.println("------------------------------------");
        che.forEach(i-> System.out.println(((Commodity)i).getName()+"\t"+((Commodity)i).getPrice()+"\t"+((Commodity)i).getNumber()+"\t"+(((Commodity)i).getNumber())*((Commodity)i).getPrice()));
        System.out.println("------------------------------------");
        System.out.println(che.size()+"项商品");

        System.out.println("共计："+x+"件");
        System.out.println("共："+num);
        System.out.println("------------------------------------");
        systemShow();
        int y=new Scanner(System.in).nextInt();
        printA(y);
    }
    public void systemShow() {
        System.out.println("请输入你要进行的操作：");
        System.out.println("1:购买超市\t2：结算并打印小票\t3：退出系统");

    }
}
