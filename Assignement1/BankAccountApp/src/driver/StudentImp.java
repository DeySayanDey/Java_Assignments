package driver;

import bank.Bank;

public class StudentImp {
    public static void main(String[] args) {
        Bank B1 = new Bank("01634001300000452", "Sayan Dey", 'S', "55000.67");
        B1.display();

        System.out.println("After Deposit ...");
        B1.deposit("45987.59");
        B1.display();

        System.out.println("After Withdraw ...");
        B1.withDraw("10000");
        B1.display();
    }
}
