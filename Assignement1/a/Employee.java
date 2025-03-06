package a;
// import java.util.Scanner;

public class Employee {
    // Instance variables
    int empId;
    String name;
    double basicSalary, hra, da, pf, grossSalary, netSalary;

    // Constructor to initialize employee details
    Employee(int id, String empName, double salary) {
        empId = id;
        name = empName;
        basicSalary = salary;
        
        // Calculating salary components
        hra = 0.20 * basicSalary;  // 20% of basic
        da = 0.10 * basicSalary;   // 10% of basic
        pf = 0.08 * basicSalary;   // 8% of basic
        grossSalary = basicSalary + hra + da;
        netSalary = grossSalary - pf;
    }

    // Method to display pay slip
    void displayPaySlip() {
        System.out.println("\n------------------------------");
        System.out.println("         PAY SLIP");
        System.out.println("------------------------------");
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + name);
        System.out.println("Basic Salary  : \u20B9" + basicSalary);
        System.out.println("HRA (20%)     : \u20B9" + hra);
        System.out.println("DA (10%)      : \u20B9" + da);
        System.out.println("PF (8%)       : \u20B9" + pf);
        System.out.println("Gross Salary  : \u20B9" + grossSalary);
        System.out.println("Net Salary    : \u20B9" + netSalary);
        System.out.println("------------------------------");
    }
}

