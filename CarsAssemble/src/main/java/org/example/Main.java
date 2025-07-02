package org.example;

public class Main {
    public static void main(String[] args) {
        CarsAssemble carsAssemnle = new CarsAssemble();
        System.out.println(carsAssemnle.productionRatePerHour(6));
        System.out.println(carsAssemnle.workingItemsPerMinute(6));
    }
}