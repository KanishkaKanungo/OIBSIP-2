import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RegisterAndLogin registerAndLogin = new RegisterAndLogin();
        registerAndLogin.register();
        print();
    }
    public static void print(){
        String b= """
                
                Press-
                1----> Deposit
                2----> Withdraw
                3----> Transfer
                4----> Transaction History
                5----> Quit
                """;
        boolean flag = true;
        int depositAmount, a = 500, transferAmount,withdrawAmount;
        ArrayList<String> list = new ArrayList<>();
        while(flag) {
            System.out.println(b);
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter choice: ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the amount to be deposited: ");
                    depositAmount = scan.nextInt();
                    Deposit deposit = new Deposit(depositAmount);
                    a = deposit.getBalance();
                    list.add("Rs."+depositAmount + " Deposited");
                    System.out.println();
                    System.out.println("Amount Deposited Successfully !!");
                }
                case 2 -> {
                    System.out.print("Enter the amount to be withdrawn: ");
                    withdrawAmount = scan.nextInt();
                    if (a > withdrawAmount) {
                        Withdraw withdraw = new Withdraw(withdrawAmount, a);
                        a = withdraw.getBalance();
                        list.add("Rs."+withdrawAmount + " Withdrawn");
                        System.out.println();
                        System.out.println("Amount Withdrawn Successfully !!");
                    } else {
                        System.out.println("Insufficient Balance !!");
                    }
                }
                case 3 -> {
                    System.out.print("Enter the Recipient's Name: ");
                    String name = scan.next();
                    System.out.print("Enter the amount to be transferred: ");
                    transferAmount = scan.nextInt();
                    if (a > transferAmount) {
                        Transfer transfer = new Transfer(transferAmount, a);
                        a = transfer.getBalance();
                        list.add("Rs."+transferAmount + " transferred to " + name + " account");
                        System.out.println();
                        System.out.println("Amount Transferred Successfully !!");
                    } else {
                        System.out.println("Insufficient Balance !!");
                    }
                }
                case 4 -> {
                    for(int i=0;i< list.size();i++){
                        System.out.printf("-----> %s%n", list.get(i));
                    }
                }
                case 5 -> {
                    System.out.println("Goodbye :) ");
                    flag = false;
                }
                default -> System.out.println("Invalid Entry !!");
            }
            ;
        }
    }
}
