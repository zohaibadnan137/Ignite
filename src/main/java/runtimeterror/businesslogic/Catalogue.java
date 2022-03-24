package runtimeterror.businesslogic;

import java.util.ArrayList;

public class Catalogue {
    private ArrayList<Car> cars;

    public Catalogue() {
        cars = null;
    }

    public void addCar() {
        if (cars == null)
            cars = new ArrayList<>();
    }
}
