package org.telekom.designpatterns.viselkedesi.command;

public interface Command {

    void execute(Employee employee);

    void undo(Employee employee);
}
