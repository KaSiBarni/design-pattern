package org.telekom.designpatterns.singleton;

import org.telekom.designpatterns.intro.composition.Employee;

import java.util.List;

public class EmployeeService {

    private final EmployeeDao employeeDao;

    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public List<Employee> listEmployee(){
       return employeeDao.listEmployee();
    }

    public void saveEmployee(Employee employee){
        employeeDao.saveEmployee(employee);
    }
}
