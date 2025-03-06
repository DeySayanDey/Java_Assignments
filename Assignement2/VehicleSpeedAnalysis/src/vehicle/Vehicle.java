package vehicle;

import java.util.Scanner;
import speedCalculator.SpeedCalculator;
import speedCalculator.SpeedInfo;

public class Vehicle {
    public static void main(String[] args) {
        Scanner sce = new Scanner(System.in);
        SpeedCalculator speedCalculator = new SpeedCalculator();

        while (true){
            System.out.println("Enter the speed of the vehicle: ");
            double speed = sce.nextDouble();
            if(speed<0){
                System.out.println("Invalid speed");
                continue;
            }
            SpeedInfo speedInfo = speedCalculator.calculateSpeed(speed);
            System.out.println("Your speed is: " + speedInfo.getSpeed() + "km/h and it is " + speedInfo.getSpeedType());
        }
        
        
    }
}
