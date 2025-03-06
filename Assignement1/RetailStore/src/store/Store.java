package store;

import java.util.Scanner;
import taxanddiscount.Calculation;

public class Store {
    public static void main(String[] args) {
        double totalAmount = 0.0;
        double totalTax = 0.0;
        double totalDiscount = 0.0;
        double netPrice = 0.0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Retail Store!");
            System.out.println("Enter number of items: ");
            int numItems = scanner.nextInt();
            if (numItems <= 0) {
                System.out.println("Invalid input. Please try again.");
                continue;
            }
            for (int i = 0; i < numItems; i++) {
                System.out.println("Enter item type (E for Essential and N for Non-Essential): ");
                String type = scanner.next().trim().toLowerCase();

                if (!type.equals("e") && !type.equals("n")) {
                    System.out.println("Invalid type entered. Please try again.");
                    i--;
                    continue;
                }

                System.out.println("Enter item price: ");
                double price = scanner.nextDouble();

                if (price <= 0) {
                    System.out.println("Invalid price. Please try again.");
                    i--;
                    continue;
                }

                System.out.println("Enter item quantity: ");
                int quantity = scanner.nextInt();

                if (quantity <= 0) {
                    System.out.println("Invalid quantity. Please try again.");
                    i--;
                    continue;
                }

                double productPrice = Calculation.calculatePrice(type, price, quantity);
                double tax = Calculation.calculateTax(type, price, quantity);
                double discount = Calculation.calculateDiscount(type, price, quantity);

                
                netPrice += price * quantity;
                totalTax += tax;
                totalDiscount += discount;
                totalAmount += productPrice;
            }

        System.out.println("\n---------- Bill Summary ----------");
        System.out.printf("Total Price (before tax and discount): %.2f%n", netPrice);
        System.out.printf("Total Tax: %.2f%n", totalTax);
        System.out.printf("Total Discount: %.2f%n", totalDiscount);
        System.out.printf("Total Amount to be paid: %.2f%n", totalAmount);
        System.out.println("----------------------------------\n");
    }
   
}
}
