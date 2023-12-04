package org.telekom.designpatterns.szerkezeti.proxy;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

    private List<Employee> employees = new ArrayList<>();

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public List<Employee> listEmployee() {
        return new ArrayList<>(employees);
    }
}
