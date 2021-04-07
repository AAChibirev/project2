package chapter2;

import java.math.BigDecimal;
import java.util.Scanner;

class Car {
    private double distance = 0.0;
    private double fuelLevel = 0.0;
    private double fuelEfficiency = 8.0; // 8l per 100km

    public Car(double fuelLevel, double fuelEfficiency) {
        this.fuelLevel = fuelLevel;
        this.fuelEfficiency = fuelEfficiency;
    }

    //if distance is all passed kilometers -->> distance += Math.abs(miles)
    //if distance is path from 0.0 to current position on x-axis -->> distance += miles
    public void driveByGivenMiles(double miles) {
        Scanner scanner = new Scanner(System.in);
        double milesLeft = miles;
        double milesPossibleAtTheMoment = (fuelLevel / fuelEfficiency * 100);
        while (milesLeft > 0) {
            if (new BigDecimal(milesLeft).compareTo(new BigDecimal(milesPossibleAtTheMoment)) < 0) {
                distance += milesLeft;
                fuelLevel -= milesLeft / fuelEfficiency;
                milesLeft = 0;
            }
            else {
                distance += milesPossibleAtTheMoment;
                milesLeft -= milesPossibleAtTheMoment;
                fuelLevel = 0;
                System.out.println("Empty tank. Need a gas. Miles left: " + milesLeft);
                System.out.print("Input liters of gas: ");
                addFuel(scanner.nextDouble());
                System.out.println("Loading... Now gas: " + fuelLevel);
            }
        }
    }

    public void addFuel(double gallons){
        if (gallons > 0) {
            fuelLevel += gallons;
        }
    }

    public double getDistance() {
        return distance;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }
}
