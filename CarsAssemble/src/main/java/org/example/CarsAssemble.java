package org.example;

public class CarsAssemble {

    public double productionRatePerHour(int speed) {

        int carsPerHour = 221;

        double result = 0.0;

        if(speed >= 1 && speed <= 4){

            result =  speed * carsPerHour * 1;

        }else if (speed >= 5 && speed <= 8){

            result = speed * carsPerHour * 0.9;

        }else if (speed == 9){

            result = speed * carsPerHour * 0.8;

        }else if (speed == 10){

            result = speed * carsPerHour * 0.77;

        }

        return result;
    }

    public double workingItemsPerMinute(int speed) {
        double production = productionRatePerHour(speed);

        double carsPerMinute = production / 60;
        return (int)carsPerMinute;
    }

}
