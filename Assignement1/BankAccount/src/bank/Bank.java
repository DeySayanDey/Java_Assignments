package bank;

public class Bank {
    private String accountNumber;
    private String customerName;
    private char accountType;
    private double balance;

    // Constructor
    public Bank(String accountNumber, String customerName, char accountType, String balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.accountType = accountType;
        this.balance = Double.parseDouble(balance);
    }

    // Display customer details
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }

    // Deposit method
    public void deposit(String amount) {
        double depositAmount = Double.parseDouble(amount);
        balance += depositAmount;
        System.out.println(amount + " deposited successfully.");
    }

    // Withdraw method
    public void withDraw(String amount) {
        double withdrawAmount = Double.parseDouble(amount);
        if (balance - withdrawAmount > 5000) {
            balance -= withdrawAmount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance. Minimum balance of 5000 must be maintained.");
        }
    }
}

