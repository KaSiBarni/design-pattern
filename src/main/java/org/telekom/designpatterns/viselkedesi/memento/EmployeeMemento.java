package org.telekom.designpatterns.viselkedesi.memento;

public class EmployeeMemento {

    private String name;

    private long salary;

    public EmployeeMemento(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }
}
