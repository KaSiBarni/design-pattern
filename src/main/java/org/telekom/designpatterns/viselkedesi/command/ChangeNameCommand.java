package org.telekom.designpatterns.viselkedesi.command;

public class ChangeNameCommand implements Command{

    private String name;

    public ChangeNameCommand(String name) {
        this.name = name;
    }

    @Override
    public void execute(Employee employee) {
        employee.setName(name);
    }

    @Override
    public void undo(Employee employee) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
