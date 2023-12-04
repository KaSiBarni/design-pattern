package org.telekom.designpatterns.viselkedesi.memento;

public class Employee {

    private String name;

    private long salary;

    public Employee(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    public EmployeeMemento save(){
        return new EmployeeMemento(name, salary);
    }

    public void restore(EmployeeMemento employeeMemento){
        this.name = employeeMemento.getName();
        this.salary = employeeMemento.getSalary();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
