package org.telekom.designpatterns.bridge;

public class Employee {

    private String name;

    private PayDetails payDetails;

    private Bonus bonus;

    public Employee(String name, PayDetails payDetails, Bonus bonus) {
        this.name = name;
        this.payDetails = payDetails;
        this.bonus = bonus;
    }

    public double pay(){
        return payDetails.pay() + bonus.payBonus();
    }
}
