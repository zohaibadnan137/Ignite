package runtimeterror.businesslogic;

public class Dealership {
    private final String name;
    private final CustomerList customers;
    private final EmployeeList employees;
    private final Catalogue catalogue;
    private final ComplaintList complaints;
    private final QueryList queries;

    private final BookingList bookings;

    public Dealership(String name) {
        this.name = name;
        customers = new CustomerList();
        employees = new EmployeeList();
        catalogue = new Catalogue();
        complaints = new ComplaintList();
        queries = new QueryList();
        bookings = new BookingList();
    }

    public String getName() {
        return name;
    }

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

    public BookingList getBookings() {
        return bookings;
    }
}

