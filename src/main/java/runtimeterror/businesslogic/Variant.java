package runtimeterror.businesslogic;

public class Variant {
    private int car_id;
    private final String variant_name;
    private final int engine_capacity;
    private final String transmission;
    private final int horsepower;
    private final float zero_to_sixty;
    private final int price;

    public Variant(int car_id, String variant_name, int engine_capacity, String transmission, int horsepower, float zero_to_sixty, int price) {
        this.car_id = car_id;
        this.variant_name = variant_name;
        this.engine_capacity = engine_capacity;
        this.transmission = transmission;
        this.horsepower = horsepower;
        this.zero_to_sixty = zero_to_sixty;
        this.price = price;
    }

    public String getVariantName() {
        return variant_name;
    }

    public int getEngineCapacity() {
        return engine_capacity;
    }

    public String getTransmission() {
        return transmission;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public float getZeroToSixty() {
        return zero_to_sixty;
    }

    public int getPrice() {
        return price;
    }
}
