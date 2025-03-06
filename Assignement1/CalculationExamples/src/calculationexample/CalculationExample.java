package calculationexample;

import mypackage.Calculation;

import java.util.Scanner;

public class CalculationExample {

    public static void main(String[] args) {
        Calculation calc = new Calculation();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        int num = scanner.nextInt();
        System.out.println("Factorial of " + num + " is: " + calc.factorial(num));

        System.out.print("Enter a number to check if it is prime: ");
        long primeCheck = scanner.nextLong();
        System.out.println(primeCheck + " is prime: " + calc.isPrime(primeCheck));

        System.out.print("Enter two numbers to find their GCD: ");
        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + calc.gcd(num1, num2));

        scanner.close();
    }
}
