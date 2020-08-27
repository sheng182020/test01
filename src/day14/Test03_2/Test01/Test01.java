package day14.Test03_2.Test01;

public class Test01 {
    public static void main(String[] args) throws NotNegativeException {
        DebitCard debitCard=new DebitCard();
        debitCard.setAccountNumber("123456");
        debitCard.setMoney(-100);
        System.out.println(debitCard.getMoney());
    }

}
