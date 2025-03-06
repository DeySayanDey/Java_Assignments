package a;
import java.util.Scanner;
public class PaySlip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking employee details as input
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Basic Salary: \\u20B9");
        double salary = scanner.nextDouble();

        // Creating Employee object
        Employee emp = new Employee(id, name, salary);

        // Displaying Pay Slip
        emp.displayPaySlip();

        scanner.close();
    }
}