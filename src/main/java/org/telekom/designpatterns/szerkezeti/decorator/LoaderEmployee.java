package org.telekom.designpatterns.szerkezeti.decorator;

public class LoaderEmployee implements Employee{

    private Employee employee;

    public LoaderEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public Long getId() {
        return employee.getId();
    }

    @Override
    public void setId(Long id) {
        employee.setId(id);
    }

    @Override
    public String getName() {
        return employee.getName();
    }

    @Override
    public void setName(String name) {
        employee.setName(name);
    }

    public void load(String s){
        String[] parts = s.split(";");
        employee.setId(Long.getLong(parts [0]));
        employee.setName(parts[1]);
    }


}
