package ru.firm.automation.course_java_collections.main_task;

public class CarModel {
    private String name;
    private int maximumSpeed;
    private int price;
    private int fuelConsumption;

    protected CarModel(String name, int maximumSpeed, int price, int fuelConsumption) {
        this.name = name;
        this.maximumSpeed = maximumSpeed;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
