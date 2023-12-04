package org.telekom.designpatterns.viselkedesi.chainofresponsibility;

import java.util.function.Predicate;

public class Employee {

    private String name;

    private Predicate<Work> canFinish;

    public Employee(String name, Predicate<Work> canFinish) {
        this.name = name;
        this.canFinish = canFinish;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean canFinish(Work work) {
        return canFinish.test(work);
    }
}
