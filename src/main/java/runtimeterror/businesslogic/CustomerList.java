package runtimeterror.businesslogic;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CustomerList {
    private ArrayList<Customer> customers;

    public CustomerList() {
        customers = null;
    }

    public void addCustomer(String customer_first_name, String customer_last_name, int customer_account_number, String username, String password) throws FileNotFoundException {
        if (customers == null)
            customers = new ArrayList<>();
        customers.add(new Customer(customer_first_name, customer_last_name, customer_account_number, username, password));
    }

    public Customer authenticateCustomer(String username, String password) {
        for (Customer customer : customers)
            if (customer.authenticateCustomer(username, password))
                return customer;
        return null;
    }

    public void loadData() {

    }
}
