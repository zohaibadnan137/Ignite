package runtimeterror.businesslogic;

import runtimeterror.utilities.DateTime;
import runtimeterror.utilities.IdDispenser;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;

public class Booking {
    private final int booking_id;
    private final Customer customer;
    private final Car car;
    private final Variant variant;
    private final DateTime date_time;
    private final String color;

    public Booking(Customer customer, Car car, Variant variant, String color) throws FileNotFoundException {
        this.booking_id = IdDispenser.getID();
        this.customer = customer;
        this.car = car;
        this.variant = variant;

        LocalDateTime now = LocalDateTime.now();
        date_time = new DateTime(now.getSecond(), now.getMinute(), now.getHour(), now.getDayOfMonth(),
                now.getMonthValue(), now.getYear());

        this.color = color;
    }

    public int getBookingId() {
        return booking_id;
    }

    public Customer getBookingCustomer() {
        return customer;
    }

    public Car getBookingCar() {
        return car;
    }

    public Variant getBookingVariant() {
        return variant;
    }

    public DateTime getBookingDateTime() {
        return date_time;
    }

    public String getBookingColor() {
        return color;
    }
}
