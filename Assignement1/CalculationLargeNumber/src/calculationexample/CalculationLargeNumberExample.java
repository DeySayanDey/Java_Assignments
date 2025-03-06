package calculationexample;

import java.util.Scanner;
import mypackage.CalculationLargeNumber;

public class CalculationLargeNumberExample {
   public CalculationLargeNumberExample() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter the number = ");
      int var2 = var1.nextInt();
      System.out.println("Factorial value for " + var2 + " = " + String.valueOf(CalculationLargeNumber.factorial(var2)));
      var1.close();
   }
}
