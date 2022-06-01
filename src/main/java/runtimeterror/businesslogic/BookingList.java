package runtimeterror.businesslogic;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class BookingList {
    private final ArrayList<Booking> bookings;

    public BookingList() {
        bookings = new ArrayList<>();
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public Booking addBooking(Customer customer, Car car, Variant variant, String color) throws FileNotFoundException {
        Booking booking = new Booking(customer, car, variant, color);
        bookings.add(booking);
        return booking;
    }

    public ArrayList<Booking> getBookingsForCustomer(Customer customer) {
        ArrayList<Booking> customer_bookings = new ArrayList<>();

        for (Booking booking : bookings)
            if (booking.getBookingCustomer().getCustomerId() == customer.getCustomerId())
                customer_bookings.add(booking);

        return customer_bookings;
    }
}
