package ru.firm.automation.course_java_collections.main_task;

public abstract class Car {
    private CarModel model;

    protected Car(CarModel model) {
        this.model = model;
    }

    public CarModel getModel() {
        return model;
    }

    public void setModel(CarModel model) {
        this.model = model;
    }
}
