package mypackage;
import java.math.BigInteger;

public class Calculation {

    // Method to calculate factorial of a number
    public BigInteger factorial(Integer num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        BigInteger fact = BigInteger.ONE;
        for (Integer i = 1; i <= num; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    // Method to check if a number is prime
    public boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to calculate GCD of two numbers
    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}