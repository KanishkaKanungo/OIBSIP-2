public class Deposit {
    private int balance = 1000;
    private int depositAmount;

    public Deposit(int depositAmount) {
        this.depositAmount = depositAmount;
        balance = balance + depositAmount;
    }

    public int getBalance() {
        return balance;
    }
}
