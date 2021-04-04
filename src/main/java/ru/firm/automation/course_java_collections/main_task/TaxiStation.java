package ru.firm.automation.course_java_collections.main_task;

import java.util.List;

public class TaxiStation {
    private List<TaxiCar> cars;

    public TaxiStation(List<TaxiCar> cars) {
        this.cars = cars;
    }

    public List<TaxiCar> getCars() {
        return cars;
    }

    public void setCars(List<TaxiCar> cars) {
        this.cars = cars;
    }
}
