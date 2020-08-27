package day05;

public class Test05 {
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.setR(8);
        circle.showArea();
        circle.showPerimeter();
    }
}
class Circle{
    int r;
    public Circle(){}
    public Circle(int r){
        this.r=r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
    public void showArea(){
        System.out.println("半径为："+r+",面积为："+(3.14f*r*r));
    }
    public void showPerimeter(){
        System.out.println("半径为："+r+",周长为："+3.14f*r*2);
    }
}
