package org.telekom.designpatterns.viselkedesi.command;


import java.util.ArrayList;
import java.util.List;

//FOGADÓ OLDAL
public class Employee {

    private String name;

    private long salary;

    private List<Command> commandList = new ArrayList<>();

    public Employee(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    public void accept(Command command){
        command.execute(this);
        commandList.add(command);
    }

    public boolean undo(){
        if (commandList.isEmpty()) {
            return false;
        } else {

            Command command = commandList.get(commandList.size()-1);
            command.undo(this);
            commandList.remove(command);

            return true;
        }
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

    public List<Command> getCommandList() {
        return commandList;
    }
}
