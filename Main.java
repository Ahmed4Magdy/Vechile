
package com.vechile;
import java.util.*;
public class Main {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter vehicle type (truck/car): ");
        String vehicleType = input.nextLine().toLowerCase();

        System.out.println("Enter the vehicle weight load: ");
        int weightLoad = input.nextInt();

        Vehicle vehicle;
        if (vehicleType.equals("truck")) {
            vehicle = new truck(weightLoad);
        } else if (vehicleType.equals("car")) {
            vehicle = new car(weightLoad);
        } else {
            System.out.println("Invalid vehicle type.");
            
            return;
        }

        System.out.println("The weight load for the " + vehicleType + " is: " + vehicle.getVehicleWeightLoad());
       
    }
}
