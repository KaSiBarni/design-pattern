package org.telekom.designpatterns.letrehozasi.builder;

public class EmployeeBuilder {

    //Builder tervezéi mintha definiciója szerint interface kell
    private String name;
    private double base = 800;
    private int hours;

    public EmployeeBuilder setName(String name){
        this.name = name;
        return this;
    }

    public EmployeeBuilder setBase(double base){
        this.base = base;
        return this;
    }

    public EmployeeBuilder setHours(int hours){
        this.hours = hours;
        return this;
    }

    public Employee builder(){
        if(name == null) {
            throw new IllegalStateException("Name is required!");
        }
        return new Employee(name, new HourlyPayDetails(base,hours));
    }
}
