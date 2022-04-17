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
    private final String image_source;

    public Car(String manufacturer, String model, int fuel_tank_capacity, int weight, String image_source) throws FileNotFoundException {
        this.car_id = IdDispenser.getID();
        this.manufacturer = manufacturer;
        this.model = model;
        this.fuel_tank_capacity = fuel_tank_capacity;
        this.weight = weight;
        this.image_source = image_source;
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

    public String getManufacturerAndModel() {
        return manufacturer + " " + model;
    }

    public String getImageSource() {
        return image_source;
    }

    public int getPrice() {
        return 25000;
    }
}
