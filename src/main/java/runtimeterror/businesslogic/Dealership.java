package runtimeterror.businesslogic;

public class Dealership {
    private final String name;
    private CustomerList customers;
    private EmployeeList employees;
    private Catalogue catalogue;

    public Dealership(String name) {
        this.name = name;
        customers = null;
        employees = null;
        catalogue = null;
    }

    public String getName() {
        return name;
    }

    public void start() {
        customers = new CustomerList();
        employees = new EmployeeList();
        catalogue = new Catalogue();
    }

    public Customer authenticateCustomer(String username, String password) {
        return customers.authenticateCustomer(username, password);
    }

    public Employee authenticateEmployee(String username, String password) {
        return employees.authenticateEmployee(username, password);
    }
}
