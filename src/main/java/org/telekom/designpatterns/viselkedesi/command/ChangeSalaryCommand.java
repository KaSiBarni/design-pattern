package org.telekom.designpatterns.viselkedesi.command;

public class ChangeSalaryCommand implements Command{
    
    private long amount;

    public ChangeSalaryCommand(long amount) {
        this.amount = amount;
    }

    @Override
    public void execute(Employee employee) {
        employee.setSalary(employee.getSalary()+amount);
    }

    @Override
    public void undo(Employee employee) {
        employee.setSalary(employee.getSalary()-amount);
    }
}
