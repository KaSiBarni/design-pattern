package org.telekom.designpatterns.factorymethod;

public class MonthlyPayDetailsFactory implements PayDetailsFactory{

    @Override
    public PayDetails create() {
        return new MonthlyPayDetails(0);
    }
}
