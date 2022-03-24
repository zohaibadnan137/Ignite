package runtimeterror.businesslogic;

import runtimeterror.utilities.IdDispenser;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Car {
    private final int car_id;
    private final String manufacturer;
    private final String model;
    private final int fuel_tank_capacity;
    private final int weight;
    private ArrayList<Variant> variants;

    public Car(String manufacturer, String model, int fuel_tank_capacity, int weight) throws FileNotFoundException {
        this.car_id = IdDispenser.getID();
        this.manufacturer = manufacturer;
        this.model = model;
        this.fuel_tank_capacity = fuel_tank_capacity;
        this.weight = weight;
    }

    public int getCarId() {
        return car_id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getFuelTankCapacity() {
        return fuel_tank_capacity;
    }

    public int getWeight() {
        return weight;
    }
}
