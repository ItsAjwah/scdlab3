import java.util.Scanner;

public class BankAccount {
    private String acc_no;
    private String acc_hn;
    private double acc_bal;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.acc_no = accountNumber;
        this.acc_hn = accountHolderName;
        this.acc_bal = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            acc_bal += amount;
            System.out.println("Deposited Rs." + amount + " into account " + acc_no);
        } else {
            System.out.println("Invalid deposit amount. Amount must be greater than zero.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (acc_bal >= amount) {
                acc_bal -= amount;
                System.out.println("Withdrawn Rs." + amount + " from account " + acc_no);
            } else {
                System.out.println("Insufficient balance. Cannot withdraw Rs." + amount);
            }
        } else {
            System.out.println("Invalid withdrawal amount. Amount must be greater than zero.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Account Holder: " + acc_hn);
        System.out.println("Account Balance: Rs." + acc_bal);
    }

}
