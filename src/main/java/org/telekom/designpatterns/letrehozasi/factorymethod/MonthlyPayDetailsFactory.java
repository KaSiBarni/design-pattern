package org.telekom.designpatterns.letrehozasi.factorymethod;

public class MonthlyPayDetailsFactory implements PayDetailsFactory{

    @Override
    public PayDetails create() {
        return new MonthlyPayDetails(0);
    }
}
