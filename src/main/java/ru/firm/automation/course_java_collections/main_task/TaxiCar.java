package ru.firm.automation.course_java_collections.main_task;

public class TaxiCar extends Car {
    private int taxiStationNumber;

    public TaxiCar(CarModel model, Integer taxiStationNumber) {
        super(model);
        this.taxiStationNumber = taxiStationNumber;
    }

    public Integer getTaxiStationNumber() {
        return taxiStationNumber;
    }

    public void setTaxiStationNumber(Integer taxiStationNumber) {
        this.taxiStationNumber = taxiStationNumber;
    }
}
