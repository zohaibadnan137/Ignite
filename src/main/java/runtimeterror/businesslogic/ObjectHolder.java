package runtimeterror.businesslogic;

public class ObjectHolder {
    private Customer customer;
    private Employee employee;
    private Car car;

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
}
