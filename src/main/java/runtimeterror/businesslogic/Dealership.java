package runtimeterror.businesslogic;

public class Dealership {
    private final String name;
    private final CustomerList customers;
    private final EmployeeList employees;
    private final Catalogue catalogue;
    private final ComplaintList complaints;
    private final QueryList queries;

    public Dealership(String name) {
        this.name = name;
        customers = new CustomerList();
        employees = new EmployeeList();
        catalogue = new Catalogue();
        complaints = new ComplaintList();
        queries = new QueryList();
    }

    public String getName() {
        return name;
    }

    /*public Customer authenticateCustomer(String username, String password) {
        return customers.authenticateCustomer(username, password);
    }

    public Employee authenticateEmployee(String username, String password) {
        return employees.authenticateEmployee(username, password);
    }

    public void addCustomer(String customer_name, int customer_account_number, String username, String password) throws FileNotFoundException {
        this.customers.addCustomer(customer_name, customer_account_number, username, password);
    }*/
    public CustomerList getCustomers() {
        return customers;
    }

    public EmployeeList getEmployees() {
        return employees;
    }

    public Catalogue getCatalogue() {
        return catalogue;
    }

    public ComplaintList getComplaints() {
        return complaints;
    }

    public QueryList getQueries() {
        return queries;
    }
}

