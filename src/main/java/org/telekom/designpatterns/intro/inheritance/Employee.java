package org.telekom.designpatterns.intro.inheritance;


//Abstract hogy ne legyen példányositható
public abstract class Employee {

    private String name;

    public abstract double pay();

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
