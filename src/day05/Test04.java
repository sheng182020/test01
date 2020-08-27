package day05;

public class Test04 {
    public static void main(String[] args) {
        Card card=new Card("黑桃","A");
        card.showCard();
    }
}
class Card{
    String color;
    String num;
    public Card(String color,String num){
        this.color=color;
        this.num=num;
    }
    public void showCard(){
        System.out.println(color+num);
    }
}
