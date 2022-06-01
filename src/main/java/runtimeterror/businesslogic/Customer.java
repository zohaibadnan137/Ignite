package runtimeterror.businesslogic;

import runtimeterror.utilities.IdDispenser;

import java.io.FileNotFoundException;

public class Customer {

    private final int customer_id;
    private final String customer_first_name;
    private final String customer_last_name;
    private final int customer_account_number;
    private final String username;
    private final String password;
    private final String phone_number;

    public Customer(String customer_first_name, String customer_last_name, int customer_account_number, String username, String password, String phone_number) throws FileNotFoundException {
        this.customer_id = IdDispenser.getID();
        this.customer_first_name = customer_first_name;
        this.customer_last_name = customer_last_name;
        this.customer_account_number = customer_account_number;
        this.username = username;
        this.password = password;
        this.phone_number = phone_number;
    }

    public int getCustomerId() {
        return customer_id;
    }

    public String getCustomerFirstName() {
        return customer_first_name;
    }

    public String getCustomerLastName() {
        return customer_last_name;
    }

    public int getCustomerAccountNumber() {
        return customer_account_number;
    }

    public boolean authenticateCustomer(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public String getPhoneNumber() {
        return phone_number;
    }

    public String getCustomerFullName() {
        return customer_first_name + " " + customer_last_name;
    }
}