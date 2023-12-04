package org.telekom.designpatterns.viselkedesi.chainofresponsibility;

public class Work {

    private String name;

    private boolean finished = false;

    private Employee employee;

    public Work(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public void finish( Employee employee ){
        finished = true;
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }
}
