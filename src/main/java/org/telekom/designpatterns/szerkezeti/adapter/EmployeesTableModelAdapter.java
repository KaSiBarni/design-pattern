package org.telekom.designpatterns.szerkezeti.adapter;

import java.util.Arrays;
import java.util.List;

public class EmployeesTableModelAdapter implements TableModel{

    private List<Employee> employees;

    public EmployeesTableModelAdapter(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public List<String> getColumns() {
        return Arrays.asList("Id", "Name", "Date of birth");
    }

    @Override
    public int getRowCount() {
        return employees.size();
    }

    @Override
    public String getValue(int row, int column) {
        Employee employee = employees.get(row);
        switch (column){
            case 0:
                return Long.toString(employee.getId());
            case 1:
                return employee.getName();
            case 2:
                return employee.getDateOfBirth().toString();
            default:
                throw new IllegalArgumentException("Not valid index: " + column);
        }
    }
}
