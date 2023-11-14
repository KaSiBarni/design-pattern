package org.telekom.designpatterns.proxy;

import java.util.List;

public interface EmployeeService {

    void addEmployee(Employee employee);

    List<Employee> listEmployee();
}
