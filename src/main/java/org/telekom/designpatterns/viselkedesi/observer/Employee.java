package org.telekom.designpatterns.viselkedesi.observer;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;

    private long salary;

    private List<EmployeeObserver> employeeObservers = new ArrayList<>();

    public Employee(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    public void register(EmployeeObserver observer){
        employeeObservers.add(observer);
    }

    public void remove(EmployeeObserver observer){
        employeeObservers.remove(observer);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;

        employeeObservers.stream().forEach(o -> o.nameHasChanged(oldName, name));
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
