package runtimeterror.businesslogic;

public class ObjectHolder {
    private Customer customer;
    private Employee employee;
    private Car car;
    private Booking booking;
    private Variant variant;
    private String color;

    private static final ObjectHolder INSTANCE = new ObjectHolder();

    private ObjectHolder() {
    }

    public static ObjectHolder getInstance() {
        return INSTANCE;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setVariant(Variant variant) {
        this.variant = variant;
    }

    public Variant getVariant() {
        return variant;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
