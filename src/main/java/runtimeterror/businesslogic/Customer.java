package runtimeterror.businesslogic;

import runtimeterror.utilities.IdDispenser;

import java.io.FileNotFoundException;

public class Customer {

    private final int customer_id;
    private final String customer_name;
    private final int customer_account_number;
    private final String username;
    private final String password;

    public Customer(String customer_name, int customer_account_number, String username, String password) throws FileNotFoundException {
        this.customer_id = IdDispenser.getID();
        this.customer_name = customer_name;
        this.customer_account_number = customer_account_number;
        this.username = username;
        this.password = password;
    }

    public int getCustomerId() {
        return customer_id;
    }

    public String getCustomerName() {
        return customer_name;
    }

    public int getCustomerAccountNumber() {
        return customer_account_number;
    }

    public boolean authenticateCustomer(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}