package mypackage;

public class Calculation {

    public long factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        long fact = 1;
        for (Integer i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if a number is prime
    public boolean isPrime(long num) {
        if (num <= 1) return false;
        if (num <= 3) return true; // 2 and 3 are prime
        if (num % 2 == 0 || num % 3 == 0) return false; // Eliminate multiples of 2 and 3
    
        for (int i = 5; i * i <= num; i += 6) { // Check only 6k ± 1 numbers
            System.out.println("hello");
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }
    

    // Method to calculate GCD of two numbers
    public long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}