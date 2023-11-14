package org.telekom.designpatterns.proxy;

import java.util.List;

public class ValidatorEmployeeService implements EmployeeService{

    private EmployeeService employeeService;

    public ValidatorEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public void addEmployee(Employee employee) {
        if (employee.getName() == null) {
            throw new IllegalArgumentException("Name cannot be null!");
        }
        employeeService.addEmployee(employee);
    }

    @Override
    public List<Employee> listEmployee() {
        return employeeService.listEmployee();
    }

}
