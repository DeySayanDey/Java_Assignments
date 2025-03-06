package assignment;

import java.util.Scanner;
import mypackage.GradeCalculator;

public class GradeAssignmentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeCalculator calculator = new GradeCalculator();

        System.out.print("Enter marks for subject 1: ");
        int mark1 = scanner.nextInt();
        System.out.print("Enter marks for subject 2: ");
        int mark2 = scanner.nextInt();
        System.out.print("Enter marks for subject 3: ");
        int mark3 = scanner.nextInt();

        if (!calculator.isValidMark(mark1) || !calculator.isValidMark(mark2) || !calculator.isValidMark(mark3)) {
            System.out.println("Invalid marks! Marks should be between 1 and 100.");
            scanner.close();
            return;
        }

        long total = calculator.calculateTotal(mark1, mark2, mark3);
        double average = calculator.calculateAverage(total);
        char grade = calculator.assignGrade(average);

        System.out.println("Total Marks: " + total);
        System.out.printf("Average Marks: %.2f%n", average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
