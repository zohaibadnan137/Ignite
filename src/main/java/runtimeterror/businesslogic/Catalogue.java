package runtimeterror.businesslogic;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Catalogue {
    private ArrayList<Car> cars;

    public Catalogue() {
        cars = null;
    }

    public void addCar(String manufacturer, String model, int fuel_tank_capacity, int weight, String image_source) throws FileNotFoundException {
        if (cars == null)
            cars = new ArrayList<>();
        Car car = new Car(manufacturer, model, fuel_tank_capacity, weight, image_source);
        cars.add(car);
    }

    public ArrayList<Car> getCars() {
        return cars;
    }
}
