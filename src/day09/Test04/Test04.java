package day09.Test04;

public class Test04 {
    public static void main(String[] args) {
        OldPhone o=new OldPhone();
        o.call();
        o.sendMessage();
        NewPhone n=new NewPhone();
        n.call();
        n.sendMessage();
        n.playGame();
    }
}
