package day5.Test4;

public class Card {
     private String color;
    private String num;
    public Card(String color,String num){
        this.color=color;
        this.num=num;
    }
    public void showCard(){
        System.out.println(color+num);
    }
}
