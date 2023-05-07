public class Withdraw {
    private int balance;
    private int withdrawBalance;

    public Withdraw(int withdrawBalance,int balance) {
        this.balance = balance-withdrawBalance;
    }

    public int getBalance() {
        return balance;
    }
}
