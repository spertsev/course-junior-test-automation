package ru.firm.automation.course_java_collections.main_task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class TaxiProgramActions {
    public TaxiStation createTaxiStation() {
        final int taxiCarsAmount = ThreadLocalRandom.current().nextInt(10, 20);
        List<CarModel> carModels = new ArrayList<>();
        carModels.add(new CarModel("Lada Vesta", 120, 500_000, 10));
        carModels.add(new CarModel("Reno Logan", 130, 600_000, 11));
        carModels.add(new CarModel("Ford Mondeo", 150, 1_000_000, 14));
        List<TaxiCar> taxiCars = new ArrayList<>();
        for (int i = 0; i <= taxiCarsAmount; i++) {
            CarModel currentCarModel = carModels.get(ThreadLocalRandom.current().nextInt(0, carModels.size()));
            taxiCars.add(new TaxiCar(currentCarModel, i));
        }
        return new TaxiStation(taxiCars);
    }

    public void printTaxiStationCars(TaxiStation station) {
        System.out.println("Current taxi station cars:");
        List<TaxiCar> taxiCars = station.getCars();
        for (TaxiCar currentCar : taxiCars) {
            System.out.println("Car's station number:" + currentCar.getTaxiStationNumber() + ", model:" + currentCar.getModel().getName());
        }
    }

    public long calculateTaxiStationPrice(TaxiStation station) {
        long price = 0;
        List<TaxiCar> cars = station.getCars();
        for (TaxiCar currentCar : cars) {
            price += currentCar.getModel().getPrice();
        }
        return price;
    }

    public void printCarsSortedPerFuelConsumption(TaxiStation station) {
        List<TaxiCar> cars = station.getCars();
        cars.sort(new Comparator<TaxiCar>() {
            @Override
            public int compare(TaxiCar o1, TaxiCar o2) {
                return o1.getModel().getFuelConsumption() - o2.getModel().getFuelConsumption();
            }
        });
        for (TaxiCar currentCar : cars) {
            System.out.println("Fuel consumption:" + currentCar.getModel().getFuelConsumption() +
                    ", model:" + currentCar.getModel().getName() +
                    ", station number:" + currentCar.getTaxiStationNumber());
        }
    }

    public void printCarsWithinSpeedRange(TaxiStation station, int lowSpeed, int highSpeed) {
        List<TaxiCar> cars = station.getCars();
        cars.stream()
                .filter(car -> car.getModel().getMaximumSpeed() >= lowSpeed && car.getModel().getMaximumSpeed() <= highSpeed)
                .forEach(car -> System.out.println("Car's speed:" + car.getModel().getMaximumSpeed() + " km/h"
                        + ", model:" + car.getModel().getName()
                        + ", station number:" + car.getTaxiStationNumber()));
    }


}
