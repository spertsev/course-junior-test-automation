package ru.firm.automation.course_java_collections.main_task;

import java.util.Scanner;

public class TaxiProgramMain {
    public static void main(String[] args) {
        TaxiProgramActions taxiProgramActions = new TaxiProgramActions();
        TaxiStation taxiStation = taxiProgramActions.createTaxiStation();
        Scanner scanner = new Scanner(System.in);
        boolean isProgramWorking = true;

        taxiProgramActions.printTaxiStationCars(taxiStation);
        while (isProgramWorking) {
            System.out.println("Variants of the actions:");
            System.out.println("1. Calculate the taxi station's price.");
            System.out.println("2. Sort list of the cars per their fuel consumption.");
            System.out.println("3. Input a speed range to search for appropriate cars.");
            System.out.println("10. Stop the program.");
            System.out.print("Input the number:");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Taxi station price: " + taxiProgramActions.calculateTaxiStationPrice(taxiStation) + " roubles.");
                    break;
                case 2:
                    taxiProgramActions.printCarsSortedPerFuelConsumption(taxiStation);
                    break;
                case 3:
                    System.out.print("Input the low speed of the range:");
                    int lowSpeed = scanner.nextInt();
                    System.out.print("Input the high speed of the range:");
                    int highSpeed = scanner.nextInt();
                    taxiProgramActions.printCarsWithinSpeedRange(taxiStation, lowSpeed, highSpeed);
                    break;
                case 10:
                    isProgramWorking = false;
                    break;
                default:
                    break;
            }
        }
    }
}
