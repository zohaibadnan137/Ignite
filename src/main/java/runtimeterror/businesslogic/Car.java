package runtimeterror.businesslogic;

import runtimeterror.utilities.IdDispenser;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Car {
    private final int car_id;

    private final String year;
    private final String manufacturer;
    private final String model;
    private final int fuel_tank_capacity;
    private final int weight;
    private final ArrayList<Variant> variants;
    private final String image_source;

    public Car(String year, String manufacturer, String model, int fuel_tank_capacity, int weight, String image_source) throws FileNotFoundException {
        this.car_id = IdDispenser.getID();
        this.year = year;
        this.manufacturer = manufacturer;
        this.model = model;
        this.fuel_tank_capacity = fuel_tank_capacity;
        this.weight = weight;
        variants = new ArrayList<>();
        this.image_source = image_source;
    }

    public int getCarId() {
        return car_id;
    }

    public String getYear() {
        return year;
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

    public String getLongCarName() {
        return manufacturer + " " + model;
    }

    public ArrayList<Variant> getVariants() {
        return variants;
    }

    public String getImageSource() {
        return image_source;
    }

    public int getStartingPrice() {
        int min_price = Integer.MAX_VALUE;
        for (Variant var : variants) {
            if (var.getPrice() < min_price)
                min_price = var.getPrice();
        }
        if (min_price == Integer.MAX_VALUE)
            min_price = 0;
        return min_price;
    }

    public void addVariant(String variant_name, int engine_capacity, String transmission, int horsepower, double zero_to_sixty, int price) {
        Variant var = new Variant(car_id, variant_name, engine_capacity, transmission, horsepower, zero_to_sixty, price);
        variants.add(var);
    }
}
