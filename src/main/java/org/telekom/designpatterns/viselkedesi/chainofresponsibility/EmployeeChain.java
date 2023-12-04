package org.telekom.designpatterns.viselkedesi.chainofresponsibility;

import java.util.List;

public class EmployeeChain {

    private List<Employee> employeeList;

    public EmployeeChain(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void finish(Work work){
        for (Employee employee: employeeList){
            if (employee.canFinish(work)){
                work.finish(employee);
                return;
            }
        }
    }
}
