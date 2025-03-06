package mypackage;

import java.math.BigInteger;

public class CalculationLargeNumber {

    public static BigInteger factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}
