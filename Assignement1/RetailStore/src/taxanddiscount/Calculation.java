package taxanddiscount;

public class Calculation {

    public static double calculatePrice(String type, double price, int quantity) {
        double netPrice = price * quantity;
        double tax = calculateTax(type, price, quantity);
        double discount = calculateDiscount(type, price, quantity);
        return netPrice + tax - discount;
    }

    public static double calculateTax(String type, double price, int quantity) {
        double netPrice = price * quantity;
        double taxRate = 0.0;
       
        if (type.toUpperCase().equals("E")) {
            taxRate = 0.05;
        } else if (type.toUpperCase().equals("N")) {
            taxRate = 0.12;
        }

        return netPrice * taxRate;
    }

    public static double calculateDiscount(String type, double price, int quantity) {
        double netPrice = price * quantity;
        double discountRate = 0.0;

        if (type.toUpperCase().equals("E") && netPrice > 1000) {
            discountRate = 0.1;
        } else if (type.toUpperCase().equals("N") && netPrice > 2000) {
            discountRate = 0.15;
        }
        return netPrice * discountRate;
    }
} 