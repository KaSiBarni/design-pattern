package org.telekom.designpatterns.proxy;

import java.util.List;

public class SecurityEmployeeService implements EmployeeService{

    private SecurityContext securityContext;

    private EmployeeService employeeService;

    public SecurityEmployeeService(SecurityContext securityContext, EmployeeService employeeService) {
        this.securityContext = securityContext;
        this.employeeService = employeeService;
    }

    @Override
    public void addEmployee(Employee employee) {
        if (securityContext.hasRole("ROLE_ADD")) {
            employeeService.addEmployee(employee);
        }
        else {
            throw new SecurityException("ROLE_ADD required");
        }
    }

    @Override
    public List<Employee> listEmployee() {
        if (securityContext.hasRole("ROLE_LIST")) {
            return employeeService.listEmployee();
        }
        else {
            throw new SecurityException("ROLE_LIST required");
        }
    }
}
