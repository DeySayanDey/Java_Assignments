package management;

import fine.FineCalculator;
import java.util.Scanner;

public class LibraryManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days late: ");
        int daysLate = scanner.nextInt();

        if (daysLate < 1) {
            System.out.println("Invalid input.");
            scanner.close();
            return;
        }

        FineCalculator fineCalculator = new FineCalculator();
        int fine = fineCalculator.calculateFine(daysLate);

        if (daysLate <= 30) {
            System.out.println("The total fine is: " + fine + " INR");
        } else {
            System.out.println("Membership canceled due to excessive delay.");
        }

        scanner.close();
    }
}
