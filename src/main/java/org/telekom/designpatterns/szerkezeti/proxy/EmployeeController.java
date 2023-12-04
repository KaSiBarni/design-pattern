package org.telekom.designpatterns.szerkezeti.proxy;

import java.util.List;

public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void addEmployee(Employee employee) {
        employeeService.addEmployee(employee);
    }

    public List<Employee> listEmployees() {
        return employeeService.listEmployee();
    }
}
