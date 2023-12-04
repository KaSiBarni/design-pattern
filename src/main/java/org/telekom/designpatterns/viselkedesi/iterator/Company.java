package org.telekom.designpatterns.viselkedesi.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Company implements Iterable<Employee>{

    private List<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    @Override
    public Iterator<Employee> iterator() {
        return employeeList.iterator();
    }
}
