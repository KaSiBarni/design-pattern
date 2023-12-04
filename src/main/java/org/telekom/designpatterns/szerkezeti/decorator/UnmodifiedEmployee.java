package org.telekom.designpatterns.szerkezeti.decorator;

public class UnmodifiedEmployee implements Employee{

    private Employee employee;

    public UnmodifiedEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public Long getId() {
        return employee.getId();
    }

    @Override
    public void setId(Long id) {
        throw new UnsupportedOperationException("Unmodifiable");
    }

    @Override
    public String getName() {
        return employee.getName();
    }

    @Override
    public void setName(String name) {
        throw new UnsupportedOperationException("Unmodifiable");
    }
}
