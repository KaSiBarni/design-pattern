package org.telekom.designpatterns.qg;

public class EmployeeBuilder {

    private String name;
    private int age;
    private String position;

    public EmployeeBuilder setName( String name ) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder setAge( int age ) {
        this.age = age;
        return this;
    }

    public EmployeeBuilder setPosition( String position) {
        this.position = position;
        return this;
    }

    public Employee build(){
        return new Employee(name, age, position);
    }
}
