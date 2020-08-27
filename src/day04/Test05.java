package day04;

public class Test05 {
    public static void main(String[] args) {
        showColor("red");
    }
    public static void showColor(String color){
        switch (color){
            case "red":
                System.out.println("red是红色");
                break;
            case "blue":
                System.out.println("blue是蓝色");
                break;
            case "green":
                System.out.println("green是绿色");
                break;
            default:
                System.out.println("未知");
                break;
        }
    }
}
