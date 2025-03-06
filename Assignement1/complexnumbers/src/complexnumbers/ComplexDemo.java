package complexnumbers;

// Demo class to test the Complex class
import mypackage.Complex;
public class ComplexDemo {
    public static void main(String[] args) {
        Complex num1 = new Complex(3.5, 2.5);
        Complex num2 = new Complex(1.5, 4.5);

        System.out.println("First Complex Number: " + num1);
        System.out.println("Second Complex Number: " + num2);

        Complex sum = num1.add(num2);
        System.out.println("Sum: " + sum);

        Complex difference = num1.subtract(num2);
        System.out.println("Difference: " + difference);

        Complex product = num1.multiply(num2);
        System.out.println("Product: " + product);
    }
}
