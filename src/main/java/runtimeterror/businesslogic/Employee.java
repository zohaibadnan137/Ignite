package runtimeterror.businesslogic;


import runtimeterror.utilities.IdDispenser;

import java.io.FileNotFoundException;

public class Employee {
    private final int employee_id;
    private final String employee_name;
    private final String username;
    private final String password;

    public Employee(String employee_name, String username, String password) throws FileNotFoundException {
        this.employee_id = IdDispenser.getID();
        this.employee_name = employee_name;
        this.username = username;
        this.password = password;
    }

    public int getEmployeeId() {
        return employee_id;
    }


    public String getEmployeeName() {
        return employee_name;
    }

    public boolean authenticateEmployee(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
    
}
