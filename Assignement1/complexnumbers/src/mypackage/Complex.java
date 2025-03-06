package mypackage;

// Complex class representing a complex number
public class Complex {
    // Instance variables
    private double realPart;
    private double imaginaryPart;

    // Default constructor
    public Complex() {
        this.realPart = 0;
        this.imaginaryPart = 0;
    }

    // Parameterized constructor
    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    // Add two complex numbers
    public Complex add(Complex otherNumber) {
        return new Complex(this.realPart + otherNumber.realPart, this.imaginaryPart + otherNumber.imaginaryPart);
    }

    // Subtract two complex numbers
    public Complex subtract(Complex otherNumber) {
        return new Complex(this.realPart - otherNumber.realPart, this.imaginaryPart - otherNumber.imaginaryPart);
    }

    // Multiply two complex numbers
    public Complex multiply(Complex otherNumber) {
        double real = (this.realPart * otherNumber.realPart) - (this.imaginaryPart * otherNumber.imaginaryPart);
        double imaginary = (this.realPart * otherNumber.imaginaryPart) + (this.imaginaryPart * otherNumber.realPart);
        return new Complex(real, imaginary);
    }

    // Setter for real part
    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    // Setter for imaginary part
    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    // Getter for real part
    public double getRealPart() {
        return realPart;
    }

    // Getter for imaginary part
    public double getImaginaryPart() {
        return imaginaryPart;
    }

    // toString method to display complex number
    @Override
    public String toString() {
        return String.format("%.2f %s %.2fi", realPart, (imaginaryPart >= 0 ? "+" : "-"), Math.abs(imaginaryPart));
    }
}
