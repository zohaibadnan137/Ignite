package runtimeterror.businesslogic;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class EmployeeList {
    private ArrayList<Employee> employees;

    public EmployeeList() {
        employees = null;
    }

    public void addEmployee(String employee_name, String username, String password) throws FileNotFoundException {
        if (employees == null)
            employees = new ArrayList<>();
        employees.add(new Employee(employee_name, username, password));
    }

    public Employee authenticateEmployee(String username, String password) {
        for (Employee employee : employees)
            if (employee.authenticateEmployee(username, password))
                return employee;
        return null;
    }
}
