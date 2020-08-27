package day14.Test03_2.Test01;

public class DebitCard {
    private String accountNumber;
    private int money;

    public DebitCard() {
    }

    public DebitCard(String accountNumber, int money) {

        this.accountNumber = accountNumber;
        this.money = money;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) throws NotNegativeException {
        if (money<0){
            throw new NotNegativeException("余额不能为负数");
        }else{
            this.money = money;
        }
    }
}
