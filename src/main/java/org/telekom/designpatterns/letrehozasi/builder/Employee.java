package org.telekom.designpatterns.letrehozasi.builder;

public class Employee {

    private String name;

    private PayDetails payDetails;

    public Employee(String name, PayDetails payDetails) {
        this.name = name;
        this.payDetails = payDetails;
    }

    public double pay(){
        return payDetails.pay();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PayDetails getPayDetails() {
        return payDetails;
    }

    public void setPayDetails(PayDetails payDetails) {
        this.payDetails = payDetails;
    }
}
