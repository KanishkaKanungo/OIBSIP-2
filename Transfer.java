public class Transfer {
    private int balance;
    private int transferBalance;

    public Transfer(int transferBalance, int balance) {
        this.transferBalance = transferBalance;
        this.balance = balance - transferBalance;
    }

    public int getBalance() {
        return balance;
    }
}
